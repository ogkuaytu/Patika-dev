import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String defaultPass = "BORAYIYEDIM";
        System.out.println("sisteme hoş geldiniz lütfen şifrenizi giriniz");
        String pass = sc.nextLine();
        if (!pass.equals(defaultPass)) {
            System.out.println("Şifre yanlış sıfırlansın mı? evet/hayır");
            String secim = sc.nextLine();
            switch (secim) {
                case "evet":
                    System.out.println("lütfen yeni şifrenizi giriniz");
                    String newPass = sc.nextLine();
                    if (newPass.equals(defaultPass)) {
                        System.out.println("Şifre oluşturulamadı, Lütfen başka şifre giriniz");
                    } else {
                        System.out.println("şifre oluşturuldu :)");
                        defaultPass = newPass;
                    }
                    break;
                    
                case "hayır":
                    break;
            }
        } else {
            System.out.println("şifre dogri");
        }

    }
}