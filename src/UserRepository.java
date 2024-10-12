import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/password_manager";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";

    private Codify codify = new Codify();  // Şifreleme işlemlerini gerçekleştiren bir nesne
    private Map<String, User> users = new HashMap<>();  // Kullanıcı adına göre kullanıcıları saklayan bir harita
    private User currentUser = null;  // Şu anda oturum açmış olan kullanıcı

    // Kurucu method, kullanıcıları yükler
    public UserRepository() {
        loadUsers();
    }

    // Veritabanından kullanıcıları yükleyen özel method
    private void loadUsers() {
        String query = "SELECT username, password_hash FROM users";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String username = codify.solve(resultSet.getString("username"));
                String password = codify.solve(resultSet.getString("password_hash"));
                users.put(username, new User(username, password));
            }
        } catch (SQLException e) {
            System.out.println("Kullanıcılar yüklenirken hata oluştu: " + e.getMessage());
        }
    }

    // Yeni bir kullanıcı kaydeden method
    public void register(String username, String password) {
        if (!users.containsKey(username)) {
            String query = "INSERT INTO users (username, password_hash) VALUES (?, ?)";
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, codify.codify(username));
                preparedStatement.setString(2, codify.codify(password));
                preparedStatement.executeUpdate();
                users.put(username, new User(username, password));
                System.out.println("Kullanıcı başarıyla oluşturuldu");
            } catch (SQLException e) {
                System.out.println("Kullanıcı oluşturulurken hata oluştu: " + e.getMessage());
            }
        } else {
            System.out.println("Kullanıcı adı zaten mevcut");
        }
    }

    // Kullanıcı girişini kontrol eden method
    public void login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            System.out.println(username + " başarıyla giriş yaptı");
        } else {
            System.out.println("Yanlış kullanıcı adı veya şifre");
        }
    }

    // Kullanıcı oturumunu sonlandıran method
    public void logout() {
        currentUser = null;
        System.out.println("Başarıyla çıkış yapıldı");
    }

    // Şifre bilgisi ekleyen method
    public void addSafePassword(String safeName, String safePassword) {
        if (currentUser != null) {
            String query = "INSERT INTO passwords (user_id, description, username, password) VALUES ((SELECT id FROM users WHERE username = ?), ?, ?, ?)";
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, codify.codify(currentUser.getUsername()));
                preparedStatement.setString(2, codify.codify(safeName));
                preparedStatement.setString(3, codify.codify(safePassword));
                preparedStatement.setString(4, codify.codify(safePassword));
                preparedStatement.executeUpdate();
                currentUser.addSafe(safeName, safePassword);
                System.out.println("Şifre başarıyla kaydedildi");
            } catch (SQLException e) {
                System.out.println("Şifre kaydedilirken hata oluştu: " + e.getMessage());
            }
        } else {
            System.out.println("Önce giriş yapmalısınız");
        }
    }

    // Şifre bilgilerini görüntüleyen method
    public void displaySafePasswords() {
        if (currentUser != null) {
            String query = "SELECT description, password FROM passwords WHERE user_id = (SELECT id FROM users WHERE username = ?)";
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, codify.codify(currentUser.getUsername()));
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String description = codify.solve(resultSet.getString("description"));
                    String password = codify.solve(resultSet.getString("password"));
                    System.out.println("Açıklama: " + description + " - Şifre: " + password);
                }
            } catch (SQLException e) {
                System.out.println("Şifreler görüntülenirken hata oluştu: " + e.getMessage());
            }
        } else {
            System.out.println("Önce giriş yapmalısınız");
        }
    }
}
