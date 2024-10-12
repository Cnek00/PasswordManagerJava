public class Codify {
    //tüm karakterlerin tanımlandığı dizi
    //private olma sebebi eğer bu dizi bozulursa tüm sistemin bozulacak olması
    //ayrıca sonradan erişilmesinede gerek olmayan bir blok

    private String[] characters = new String[]{
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "Ç", "D", "E", "F", "G", "Ğ", "H",
            "I", "İ", "J", "K", "L", "M", "N", "O", "Ö", "P",
            "R", "S", "Ş", "T", "U", "Ü","X","Q", "V","W", "Y", "Z", "a",
            "b", "c", "ç", "d", "e", "f", "g", "ğ", "h", "ı",
            "i", "j", "k", "l", "m", "n", "o", "ö", "p", "r",
            "s", "ş", "t", "u", "ü", "v", "y","x","q","w", "z", "!", "@",
            "#", "$", "%", "^", "&", "*", "(", ")", "-", "_",
            "+", "=", "{", "}", "[", "]", "|", "\\", ":", ";",
            "<", ">", ".", "?", "/", " "
    };

    public String codify(String password) {
        //şifrelerin kodlanacağı blok
        StringBuilder finalPassword = new StringBuilder();
        String[] letter = password.split("");

        for (String s : letter) {
            //kodlanacak şifrenin karakterleri arasında dönen döngü
            for (int j = 0; j < characters.length; j++) {
                //tüm karakterler arasında dönen döngü
                if (s.equals(characters[j])) {
                    //eşitlik kontrolü yaparak kodlanmış şifrenin seçili karakterinin indeksinin bulunduğu kod
                    //bu ötelenmiş indexteki karakterilerin toparladığı kısım
                    finalPassword.append(characters[(j + 23) % characters.length]);
                    break;
                }
            }
        }

        return finalPassword.toString();
    }

    public String solve(String password) {
        //kodlanmış şifrenin çözümleneceği blok
        StringBuilder finalPassword = new StringBuilder();
        String[] letter = password.split("");

        for (String s : letter) {
            //kodlanmış şifrenin karakterleri arasında dönen döngü
            for (int j = 0; j < characters.length; j++) {
                //tüm karakterler arasında dönen döngü
                if (s.equals(characters[j])) {
                    //eşitlik kontrolü yaparak kodlanmış şifrenin seçili karakterinin indeksinin bulunduğu kod
                    int newIndex = (j - 23) % characters.length;
                    if (newIndex < 0) {
                        //out of index hatasını engellemek için blok
                        newIndex += characters.length;
                    }
                    //bu ötelenmiş indexteki karakterilerin toparladığı kısım
                    finalPassword.append(characters[newIndex]);
                    break;
                }
            }
        }
        return finalPassword.toString();
    }
}
