package Patika101;

import java.util.Scanner;

public class D31PatikaDevJava101Odev24YildizdanUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int tempN = n;

        for (int a = 1; a <= (n - 1); a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(".");
            }

            for (int c = 2 * tempN - 3; c > 0; c--) {

                System.out.print("*");
            }
            System.out.println();
            tempN--;
        }
    }
}
