package Patika101;

import java.util.Scanner;

public class D04PaticaDevJava101Odev02KdvHesabı {
    public static void main(String[] args) {
        Scanner kdv = new Scanner(System.in);

        double urunfiyati, eder;
        System.out.print("Ürünün bedeli nedir? ");
        urunfiyati = kdv.nextDouble();

        boolean kosul = urunfiyati >= 1000;
        eder = kosul ? urunfiyati*1.18 : urunfiyati*1.08;

        System.out.println("Ürününüzün KDV Eklenmiş Fiyatı : "+ eder);

    }
}
