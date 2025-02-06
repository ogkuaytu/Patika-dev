import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        int yas = sc.nextInt();

        if(yas % 12 == 0){
            System.out.println("Çin zodyağı burcunuz: Maymun");
        } else if (yas % 12 == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        } else if (yas % 12 == 2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        } else if (yas % 12 == 3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        } else if (yas % 12 == 4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        } else if (yas % 12 == 5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }else if (yas % 12 == 6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        } else if (yas % 12 == 7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        } else if (yas % 12 == 8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        } else if (yas % 12 == 9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        } else if (yas % 12 == 10) {
            System.out.println("Çin zodyağı burcunuz: At");
        } else if (yas % 12 == 11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }
    }
}