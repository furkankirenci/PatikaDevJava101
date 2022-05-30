package Patika101;

import java.util.Scanner;

public class D37PatikaDevJava101Odev30AsalSayi {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0) {
                System.out.println(i);
            }
        }
    }
}
