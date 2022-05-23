package Patika101;

import java.util.Scanner;

public class D11PatikaDevJAva101Odev08HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int islem;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayı : ");
        n1 = input.nextDouble();

        System.out.print("ikinci sayı : ");
        n2 = input.nextDouble();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nişleminiz nedir?");
        islem = input.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayı Sıfıra Bölünemez!!!");
                }else
                    System.out.println("Bölüm : " + (n1 / n2));
                break;
            default:
                System.out.println("Hatalı işlem girdiniz");
        }

    }


}
