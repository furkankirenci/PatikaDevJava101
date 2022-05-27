package Patika101;

import java.util.Scanner;

public class D27ArmstronSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num, basNum = 0, tempNum, total2 = 0;
        System.out.print("Bir sayi giriniz : ");
        num = inp.nextInt();
        tempNum = num;
        while (tempNum != 0) {
            basNum++;
            tempNum /= 10;
        }
        tempNum = num;
        while (tempNum > 0) {
            int kalan = tempNum % 10;
            int total = 1;
            for (int i = 1; i <= basNum; i++) {
                total *= kalan;
            }
            total2 += total;
            tempNum /= 10;
        }
        if (total2 == num) {
            System.out.println(num + " Sayisi Armstrong Sayidir.");
        } else {
            System.out.println(num + " Sayisi Armstrong Sayi Degildir.");
        }
    }
}


