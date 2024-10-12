import java.util.Random;
import java.util.Scanner;

public class Randomizer {

    // Kullanıcıdan şifre özelliklerini alarak bir şifre oluşturan metot
    public static String makePassword() {
        Scanner scanner = new Scanner(System.in); // Kullanıcı girdisini okumak için Scanner nesnesi
        System.out.print("Şifre uzunluğunu giriniz: ");
        int length = scanner.nextInt(); // Şifre uzunluğunu okuma kısmı
        scanner.nextLine();
        if (length <= 0) { // Uzunluğun geçerli olup olmadığını kontrol eden kısım
            System.out.println("Hata: Şifre uzunluğu sıfırdan küçük veya eşit olamaz.");
            return makePassword();// Uzunluk geçersiz girilirse işlemi yeniden başlatır
        } else {
            // Kullanıcıdan şifreye dahil etmek istediği karakter türlerini belirlemesini istenilen kısım
            System.out.print("Küçük harfleri kullanmak istiyor musunuz?(true/false): ");
            boolean useLowerCase = scanner.nextBoolean();
            System.out.print("Büyük harfleri kullanmak istiyor musunuz?(true/false): ");
            boolean useUpperCase = scanner.nextBoolean();
            System.out.print("Rakamları kullanmak istiyor musunuz?(true/false): ");
            boolean useNumbers = scanner.nextBoolean();
            System.out.print("Özel karakterleri kullanmak istiyor musunuz?(true/false): ");
            boolean useSpecial = scanner.nextBoolean();
            scanner.nextLine();
            String password = newPassword(length, useLowerCase, useUpperCase, useNumbers, useSpecial);
            System.out.println("Oluşturulan şifre: " + password); // Oluşturulan şifreyi gösterir
            return password; // Oluşturulan şifreyi döndürür
        }
    }

    // Belirli bir uzunlukta ve özelliklerde rastgele bir şifre oluşturan metot
    public static String newPassword(int length, boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSpecial) {
        // Şifrede kullanılacak karakterler
        String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specials = "!@#$%^&*()-_=+";

        // Kullanılacak karakterlerin toplamı
        StringBuilder forUsage = new StringBuilder();// İzin verilen karakterleri toplamak için StringBuilder kullandım
        if (useLowerCase) {
            forUsage.append(lowerCases);// Küçük harfler seçilmişse ekler
        }
        if (useUpperCase) {
            forUsage.append(upperCases);// Büyük harfler seçilmişse ekler
        }
        if (useNumbers) {
            forUsage.append(numbers);// Rakamlar seçilmişse ekler
        }
        if (useSpecial) {
            forUsage.append(specials);// Özel karakterler seçilmişse ekler
        }

        // En az bir karakter türü seçilmiş mi diye burada kontrol edilir
        if (forUsage.length() == 0) {
            System.out.println("En az bir karakter türü seçmelisiniz.");
            return "";
        }

        // Kullanılacak karakterlerin diziye dönüştürülmesi kısmı
        char[] karakterDizi = forUsage.toString().toCharArray();
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        // Belirlenen uzunlukta rastgele şifre oluşturulması kısmı
        for (int i = 0; i < length; i++) {
            password.append(karakterDizi[random.nextInt(karakterDizi.length)]);
        }

        return password.toString();
    }
}
