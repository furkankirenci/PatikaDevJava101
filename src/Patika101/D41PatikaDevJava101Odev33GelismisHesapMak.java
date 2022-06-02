package Patika101;

import java.util.Scanner;

public class D41PatikaDevJava101Odev33GelismisHesapMak {

    static void toplama(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    static void cikarma(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    static void carpma(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    static void bolme(double a, double b) {
        if (b == 0) {
            System.out.println("Bölen 0 olamaz");
        } else {
            double result = a / b;
            System.out.println(result);
        }
    }

    static void us(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
    }

    static void modAlma(int a, int b) {
        int result = a % b;
        System.out.println(result);
    }

    static void dikAlanCevre(int a, int b) {
        int cevreresult = 2 * (a + b);
        int alanresult = a * b;
        System.out.println("Alan : " + alanresult + "\nCevre : " + cevreresult);
    }

    static int fakt(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fakt(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select = 1;
        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Islem Turu : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            if (select < 0 || select > 8) {
                System.out.println("Hatali Secim Yaptiniz");
                continue;
            }

            System.out.print("ilk sayi : ");
            int a = scan.nextInt();
            System.out.print("ikinci sayi : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    us(a, b);
                    break;
                case 6:
                    System.out.println(fakt(a));
                    break;
                case 7:
                    modAlma(a, b);
                    break;
                case 8:
                    dikAlanCevre(a, b);
                    break;
                default:
            }
        }
    }
}
//Tek sorun faktoriyel hesaplarken 2. sayıyı gereksız yere sorması. Her işlem türü için sayılar
//ayrı ayrı istendiğinde sorun ortadan kalkar fakat kod uzayıp gideceği için tercih etmedim.