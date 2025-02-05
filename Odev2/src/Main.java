import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir para miktarı giriniz: ");
        double miktar = sc.nextDouble();

        if (miktar >0 && miktar < 1001){
            System.out.println("KDVsiz Fiyat: " + miktar);
            double kdvMik = miktar*18/100;
            System.out.println("Kdvli fiyat: " + kdvMik);
        } else if (miktar>1000) {
            System.out.println("KDVsiz Fiyat: " + miktar);
            double kdvMik = miktar*8/100;
            System.out.println("Kdvli fiyat: " + kdvMik);
        }

    }
}