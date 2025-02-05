import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        int mat = s.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        int fiz = s.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        int kim = s.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        int turk = s.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        int tari = s.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        int muz = s.nextInt();

        int ortalama = (mat + fiz + kim + turk + tari + muz)/6;
        if (ortalama > 60) {
            System.out.println("Sınıfı Geçti");
        }else if (ortalama < 60) {
            System.out.println("Sınıfta Kaldı");
        }

    }
}