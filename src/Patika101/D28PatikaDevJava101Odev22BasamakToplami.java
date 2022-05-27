package Patika101;

import java.util.Scanner;

public class D28PatikaDevJava101Odev22BasamakToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, kalan, total = 0;

        System.out.print("Sayi Giriniz : ");
        num = inp.nextInt();

        while (num != 0) {
            kalan = num % 10;
            total += kalan;
            num /= 10;
        }
        System.out.println("Sayinin Basamakalari Toplami : " + total);
    }
}
