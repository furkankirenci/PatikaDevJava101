package Patika101;

import java.util.Scanner;

public class D16PatikaDevJava101Odev13BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean hata = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogum Ayiniz : ");
        month = input.nextInt();

        System.out.println("Dogum gununuz : ");
        day = input.nextInt();
        if (month == 1) {
            if (day <= 21) {
                burc = "Oglak";
            } else if (day <= 31) {
                burc = "Kova";
            } else
                hata = true;

        } else if (month == 2) {
            if (day <= 19) {
                burc = "Kova";
            } else if (day <= 29) {
                burc = "Balik";
            } else
                hata = true;

        } else if (month == 3) {
            if (day <= 20) {
                burc = "Balik";
            } else if (day <= 31) {
                burc = "Koc";
            } else
                hata = true;

        } else if (month == 4) {
            if (day <= 20) {
                burc = "Koc";
            } else if (day <= 30) {
                burc = "Boga";
            } else
                hata = true;

        } else if (month == 5) {
            if (day <= 21) {
                burc = "Boga";
            } else if (day <= 31) {
                burc = "Ikizler";
            } else
                hata = true;

        } else if (month == 6) {
            if (day <= 22) {
                burc = "Ikizler";
            } else if (day <= 30) {
                burc = "Yengec";
            } else
                hata = true;

        } else if (month == 7) {
            if (day <= 22) {
                burc = "Yengec";
            } else if (day <= 31) {
                burc = "Aslan";
            } else
                hata = true;

        } else if (month == 8) {
            if (day <= 22) {
                burc = "Aslan";
            } else if (day <= 31) {
                burc = "Basak";
            } else
                hata = true;

        } else if (month == 9) {
            if (day <= 22) {
                burc = "Basak";
            } else if (day <= 30) {
                burc = "Terazi";
            } else
                hata = true;

        } else if (month == 10) {
            if (day <= 22) {
                burc = "Terazi";
            } else if (day <= 31) {
                burc = "Akrep";
            } else
                hata = true;

        } else if (month == 11) {
            if (day <= 21) {
                burc = "Akrep";
            } else if (day <= 30) {
                burc = "Yay";
            } else
                hata = true;

        } else if (month == 12) {
            if (day <= 21) {
                burc = "Yay";
            } else if (day <= 31) {
                burc = "Oglak";
            } else
                hata = true;
        } else {
            System.out.println("Hatali Ay Girisi");
        }
        if (hata) {
            System.out.println("Yanlis Gun Tercihi");
        }
        System.out.println("Burcunuz : " + burc);
    }
}
