import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz ");
        double boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo = sc.nextInt();

        double VKI = kilo / Math.pow(boy, 2);
        System.out.println("Vucut Kitle İndeksiniz: " + VKI);
    }
}