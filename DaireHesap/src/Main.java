    import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double pi = 3.14;

            System.out.print("Dairenin yarı çapını giriniz: ");
            int yariCap = sc.nextInt();

            double alan = pi * Math.pow(yariCap, 2);
            double cevre = 2 * pi * yariCap;

            System.out.println("Dairenin Alanı: " + alan + "\nDairenin cevre: " + cevre);
        }
    }