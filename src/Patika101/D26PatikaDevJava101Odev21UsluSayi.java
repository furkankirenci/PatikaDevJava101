package Patika101;

import java.util.Scanner;

public class D26PatikaDevJava101Odev21UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, total = 1;

        do {
            System.out.print("Pozitif taban sayi giriniz : ");
            a = inp.nextInt();

            System.out.print("Pozitif Us sayiyi giriniz : ");
            b = inp.nextInt();
        } while ((a < 1) || (b < 1));

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println(a + "'in " + b + "'inci kuvveti : " + total);
    }
}
