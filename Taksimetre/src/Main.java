import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç km yol gidilecek: ");
        int km = sc.nextInt();

        double tutar = (km * 2.2) + 10;
        if (tutar <20) {
            System.out.println("Gidilen yol " + km+ "km" + "\nödenecek tutar: 20 ");
        }else {
            System.out.println("Gidilen yol " + km+ "km" + "\nödenecek tutar: " + tutar);
        }

    }
}