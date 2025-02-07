import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int total = 0;

        do {
            System.out.print("Bir sayı girin (Negatif bir sayı ile sonlanır): ");
            number = scanner.nextInt();

            // Çift ve 4'ün katı olan sayıları toplama
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        } while (number >= 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + total);
    }
}
