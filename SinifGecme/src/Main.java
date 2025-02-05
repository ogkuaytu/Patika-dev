import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ort = 0;
        System.out.println("Matematik Notunu giriniz");
        int mat  = sc.nextInt();
        System.out.println("Fizik Notunu giriniz");
        int fiz = sc.nextInt();
        System.out.println("Kimya Notunu giriniz");
        int kim = sc.nextInt();
        System.out.println("Türkçe Notunu giriniz");
        int tar = sc.nextInt();
        System.out.println("Müzik Notunu giriniz");
        int mz = sc.nextInt();

        if (mat >= 0 && mat <= 100 || fiz >= 0 && fiz <= 100 || kim >= 0 && kim <= 100 || tar >= 0 && tar <= 100 || mz >= 0 && mz <=100) {
            ort = (mat + fiz + kim + tar + mz)/6;
            System.out.println("NOTUNUZ: " + ort);
        }else {
            System.out.println("DÜZGÜN SAYI GİRİNİZ");
        }
    }
}