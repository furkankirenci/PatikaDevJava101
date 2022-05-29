package Patika101;

import java.util.Scanner;

public class D34PatikaDevJava101Odev27BuyukKucukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi  gireceksiniz : ");
        int num = input.nextInt();
        int max = 0, min = 0, newNum;

        for (int i = 1; i <= num; i++) {
            System.out.print("Sayiniz : ");
            newNum = input.nextInt();
            if (i == 1) {
                max = newNum;
                min = newNum;
            } else {
                if (newNum > max) {
                    max = newNum;
                } else if (newNum < min) {
                    min = newNum;
                }
            }
        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);
    }
}


