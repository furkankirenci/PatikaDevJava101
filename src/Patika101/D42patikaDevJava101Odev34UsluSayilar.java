package Patika101;

import java.util.Scanner;

public class D42patikaDevJava101Odev34UsluSayilar {
    public static int us(int a, int b) {
        int result;
        if (b == 0) {
            return 1;
        }
        result = a * us(a, b - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayiyi giriniz : ");
        int a = input.nextInt();
        System.out.print("Us sayiyi giriniz : ");
        int b = input.nextInt();
        System.out.println(us(a, b));
    }
}
