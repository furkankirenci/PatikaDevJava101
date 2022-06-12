package Patika101;

import java.util.Arrays;
import java.util.Scanner;

public class D53PatikaDevJava101Odev44FrekansBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi girilecek : ");
        int n = input.nextInt();
        int[] list = new int[n];
        int add = 0;
        int sayac = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Sayi Giriniz : ");
            int number = input.nextInt();
            list[add++] = number;
        }
        Arrays.sort(list);
        System.out.println("Girilen Sayilar Sirayla " + Arrays.toString(list));
        for (int j = 0; j < n; j++) {
// Burda if kullanmamızın sebebi, tekrar eden sayıların her biri için tekrardan tekrar ediş sayısını yazdırmak istemememizdir.
            if ((j != 0) && (list[j] == list[j - 1])) {
                continue;
            }
            sayac = 0;
            for (int k = 0; k < n; k++) {

                if ((j != k) && (list[j] == list[k])) {
                    sayac++;
                }
            }
            if (sayac != 0) {
                System.out.println(list[j] + " sayisi " + (sayac + 1) + " kere tekrar edilmistir.");
            }
        }
    }
}
