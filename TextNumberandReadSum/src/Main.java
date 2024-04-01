import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaYolu = "src/dosya.txt"; // Dosya yolunu uygun şekilde güncelleyin

        try {
            BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu));
            String satir;
            int toplam = 0;

            while ((satir = reader.readLine()) != null) {
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }

            System.out.println("Toplam: " + toplam);

            reader.close();
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
