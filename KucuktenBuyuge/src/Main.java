import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // girilen üç sayıyı büyükten küçüğe sıralama
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sayıyı gririniz: ");
        int a = sc.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        int b = sc.nextInt();

        System.out.println("3. Sayıyı giriniz: ");
        int c = sc.nextInt();

        if (a >b && a>c){
            if (b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        }else if (c>a && c>b) {
            if (a>b){
                System.out.println("c>a>b");
            }else {
                System.out.println("c>a>b");
            }
        }
    }
}