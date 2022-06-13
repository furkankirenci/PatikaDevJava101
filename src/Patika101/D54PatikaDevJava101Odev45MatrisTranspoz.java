package Patika101;

import java.util.Arrays;
import java.util.Scanner;

public class D54PatikaDevJava101Odev45MatrisTranspoz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("matris kac satirdan olusuyor : ");
        int i = input.nextInt();
        System.out.print("matris kac sutundan olusuyor : ");
        int j = input.nextInt();

        int[][] matris = new int[i][j];
        int[][] transpoz = new int[j][i];

        for (int x = 0; x < i; x++) {
            System.out.println("---Siradaki Satir---");
            for (int y = 0; y < j; y++) {
                System.out.print("satir elemani giriniz : ");
                int number = input.nextInt();
                matris[x][y] = number;
                transpoz[y][x] = number;
            }
        }
        System.out.println("---Transpoz Matris---");
        for (int x = 0; x < transpoz.length; x++) {
            System.out.println(Arrays.toString(transpoz[x]));
        }
    }
}
