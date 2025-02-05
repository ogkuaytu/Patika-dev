public class Main {
    public static void main(String[] args) {
        int day = 5;
        int month = 2;
        String zodiacSign = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            zodiacSign = "Koç";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            zodiacSign = "Boğa";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            zodiacSign = "İkizler";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            zodiacSign = "Yengeç";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Aslan";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Başak";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Terazi";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Akrep";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Yay";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            zodiacSign = "Oğlak";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            zodiacSign = "Kova";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            zodiacSign = "Balık";
        } else {
            zodiacSign = "Geçersiz tarih";
        }

        System.out.println("Doğum tarihi: " + day + " " + month + ", Burç: " + zodiacSign);
    }
}