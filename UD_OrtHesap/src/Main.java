import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = inp.nextInt();
        int sum = 0, count = 0;

        for (int i = 0; i <= sayi; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                sum = sum +i;
                count++;
            }
        }
        int ort = sum / count;
        System.out.println("Sayıların ortalaması: " + ort);

    }
}