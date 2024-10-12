import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;            // Kullanıcı adı
    private String password;            // Kullanıcı şifresi
    private List<SafeInfo> safes;      // Kullanıcıya ait güvenli bilgilerinin listesi

    // Kullanıcı oluşturucu
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.safes = new ArrayList<>();
    }

    // Kullanıcı adını döndüren metot
    public String getUsername() {
        return username;
    }

    // Kullanıcı şifresini döndüren metot
    public String getPassword() {
        return password;
    }

    // Kullanıcıya ait Şifre bilgilerinin listesini döndüren metot
    public List<SafeInfo> getSafes() {
        return safes;
    }

    // Kullanıcıya yeni bir Şifre bilgisi ekleyen metot
    public void addSafe(String safeName, String safePassword) {
        safes.add(new SafeInfo(safeName, safePassword));
    }
}
