import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        int s1 = sc.nextInt();
        System.out.println("2. Sayıyı giriniz: ");
        int s2 = sc.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n1-> Toplama \n2-> çıkarma \n3-> çarpma \n4-> bölme");
        int secim = sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println(s1 + s2);
                break;

            case 2:
                System.out.println(s1 - s2);
                break;

            case 3:
                System.out.println(s1 * s2);
                break;

            case 4:
                System.out.println(s1 / s2);
                break;
        }
    }
}