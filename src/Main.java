import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        Scanner scanner = new Scanner(System.in);
        Codify codify = new Codify();
        Randomizer randomizer=new Randomizer();
        //kodlanmamış bir tercih yazıldığında tekrardan uygulamayı baştan açma zahmetinden kurtulmak için
        //sonsuz döngü tanımladım
        while (true) {
            System.out.println("1. Kayıt ol");
            System.out.println("2. Giriş yap");
            System.out.println("3. Şifre ekle");
            System.out.println("4. Şifreleri görüntüle");
            System.out.println("5. Çıkış yap");
            System.out.println("6. Rastgele şifre oluştur");
            System.out.println("7. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();//tercihin input alındığı kısım
            scanner.nextLine();  // bu kod olmadığında input almadan geçiyor

            switch (choice) {
                case 1:
                    //kayıt ol kısmı
                    System.out.print("Kullanıcı adı: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String newPassword = scanner.nextLine();
                    userRepository.register(newUsername, newPassword);//hesap kaydetme fonksiyonu
                    break;
                case 2:
                    //giriş yap kısmı
                    System.out.print("Kullanıcı adı: ");
                    String username = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String password = scanner.nextLine();
                    userRepository.login(username, password);//hesaba giriş yapma fonksiyonu
                    break;
                case 3:
                    //şifre ekle kısmı
                    System.out.print("Açıklama: ");
                    String safeName = scanner.nextLine();
                    System.out.println("1-Şifremi manuel girmek istiyorum");
                    System.out.println("2-Şifrem random oluşsun");
                    System.out.print("Seçiminiz: ");
                    choice= scanner.nextInt();
                    scanner.nextLine();

                    if(choice==1){
                        //kullanıcı kendi şifresini girmek istediğinde çalışacak kısım
                        System.out.print("Şifre: ");
                        String safePassword = scanner.nextLine();
                        userRepository.addSafePassword(safeName, safePassword);//hesap içine şifre kaydeden kod
                    }
                    else {
                        //rastgele şifre oluşturup kaydeden kısım
                        String safePassword = randomizer.makePassword();//rasgele şifre oluşturup değişkene atan metod
                        userRepository.addSafePassword(safeName, safePassword);
                    }


                    break;
                case 4:
                    //girilmiş hesaptaki şifrelerin görüntülendiği kısım
                    userRepository.displaySafePasswords();
                    break;
                case 5:
                    //hesaptan çık kısmı
                    userRepository.logout();
                    break;
                case 6:
                    //sadece rastgele şifre oluşturulan kısım
                    Randomizer.makePassword();
                    break;
                case 7:
                    //komple uygulamadan çıkan kısım
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    //beklenmeyen sonuç aldığında çalışacak kısım
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
                    break;
            }
        }
    }
}
