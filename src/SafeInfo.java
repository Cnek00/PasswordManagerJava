public class SafeInfo {
    private String safeName;        // Şifre bilgisinin adı
    private String safePassword;    // Şifre bilgisinin şifresi

    // Şifre bilgisi oluşturucu
    public SafeInfo(String safeName, String safePassword) {
        this.safeName = safeName;
        this.safePassword = safePassword;
    }

    // Şifre bilgisinin adını döndüren metot
    public String getSafeName() {
        return safeName;
    }

    // Şifre bilgisinin şifresini döndüren metot
    public String getSafePassword() {
        return safePassword;
    }
}
