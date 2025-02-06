import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz:");
        int km = sc.nextInt();

        if (km <= 0) { // Mesafe negatif veya 0 olamaz
            System.out.println("Hatalı mesafe girdiniz!");
            return;
        }

        double price = km * 0.1;

        System.out.println("Yaşınızı giriniz:");
        int yas = sc.nextInt();

        if (yas <= 0) { // Yaş negatif veya 0 olamaz
            System.out.println("Hatalı yaş girdiniz!");
            return;
        }

        double newPrice = price; // Varsayılan olarak indirimsiz fiyat

        // Yaşa göre indirim uygulama
        if (yas < 12) {
            newPrice = price / 2; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            newPrice = price * 0.9; // %10 indirim
        } else if (yas >= 65) {
            newPrice = price * 0.7; // %30 indirim
        }

        System.out.println("Yolculuk tipini giriniz (1 => Tek yön, 2 => Gidiş Dönüş):");
        int secim = sc.nextInt();

        if (secim != 1 && secim != 2) { // Yolculuk tipi 1 veya 2 dışında olamaz
            System.out.println("Hatalı yolculuk tipi girdiniz!");
            return;
        }

        if (secim == 2) {
            newPrice = newPrice * 0.8 * 2; // Gidiş dönüşte %20 indirim ve çift ücret
        }

        System.out.println("Toplam tutar: " + newPrice + " TL");
    }
}
