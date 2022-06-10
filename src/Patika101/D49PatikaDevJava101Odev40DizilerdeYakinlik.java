package Patika101;

import java.util.Arrays;
import java.util.Scanner;

public class D49PatikaDevJava101Odev40DizilerdeYakinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = input.nextInt();
        int[] list = {10, 30, 50, 60, 40, 20};
        int max = list[0];
        int min = list[0];
        Arrays.sort(list);
        for (int i : list) {
            if (i <= n) {
                max = i;
            }
            if (i >= n) {
                min = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}