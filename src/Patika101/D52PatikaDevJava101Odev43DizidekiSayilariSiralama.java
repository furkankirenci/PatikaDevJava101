package Patika101;

import java.util.Arrays;
import java.util.Scanner;

public class D52PatikaDevJava101Odev43DizidekiSayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi adeti nedir ? ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int start = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Sayi giriniz : ");
            int number = input.nextInt();
            arr[start++] = number;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
