package Patika101;

import java.util.Scanner;

public class D36PatikaDevJava101Odev29TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz : ");
        int basNum = input.nextInt();
        int tempBasNum = basNum;
        for (int i = 1; i <= basNum; i++) {
            for (int j = 1; j < (i); j++) {
                System.out.print(".");
            }
            int k = 1;
            do {
                System.out.print("*");
                k++;
            } while (k <= 2 * tempBasNum - 1);
            System.out.println();
            tempBasNum--;
        }
    }
}

