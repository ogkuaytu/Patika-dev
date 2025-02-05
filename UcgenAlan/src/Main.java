import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Üçgenin 1. Kenarını giriniz: ");
        int kenar1 = sc.nextInt();
        System.out.println("Üçcgenin 2. kenarını giriniz: ");
        int kenar2 = sc.nextInt();
        System.out.println("Üçgenin 3. kenarını giriniz: ");
        int kenar3 = sc.nextInt();

        int u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin alanı = " + alan);
    }
}