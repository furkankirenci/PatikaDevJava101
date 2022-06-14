package Patika101;

import java.util.Scanner;

public class D55PatikaDevJava101Odev46SayiTahmini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = Math.rint(Math.random() * 100);
        int right = 5;

        while (right != 0) {
            System.out.println("kalan hakkiniz : " + right);
            System.out.print("1-100 arasindaki sayiyi tahmin ediniz : ");
            int tahmin = input.nextInt();
            if (tahmin == number) {
                System.out.println("KAZANDINIZ");
                break;
            } else {
                if (tahmin < number) {
                    if (right != 1) {
                        System.out.println("--yukari--");
                    }
                } else {
                    if (right != 1) {
                        System.out.println("--asagi--");
                    }
                }
            }
            right--;
        }
        if (right == 0) {
            System.out.println("LOSER");
        }
    }
}
