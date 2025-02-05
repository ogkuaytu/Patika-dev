import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut kaç kilo? : ");
        double armutKg = sc.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elmaKg = sc.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domatesKg = sc.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muzKg = sc.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKg = sc.nextDouble();


        double toplamTutar = (armutKg * armutFiyat) +
                (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) +
                (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        System.out.printf("Toplam Tutar: %.2f TL%n", toplamTutar);
    }
}