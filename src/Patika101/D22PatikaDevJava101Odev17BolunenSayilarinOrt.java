package Patika101;

import java.util.Scanner;

public class D22PatikaDevJava101Odev17BolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k, x = 1, sayac = 0, sayi = 0;
        System.out.println("Sayi Giriniz : ");
        k = inp.nextInt();

        while (x <= k) {
            if ((x % 4 == 0) && (x % 3 == 0)) {
                sayac += 1;
                sayi += x;
                x++;
            } else
                ++x;
        }
        System.out.println(sayi / sayac);
        System.out.println("Program Bitmistir");
    }
}
