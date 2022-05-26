package Patika101;

import java.util.Scanner;

public class D23PatikaDevJava101Odev18DordunKati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, total = 0;

        do {
            System.out.print("Bir Sayi Giriniz : ");
            num = sc.nextInt();
            if (num % 4 == 0) {
                total += num;
            }
        } while (num % 2 == 0);
        System.out.println(total);
    }
}
