package Patika101;

import java.util.Scanner;

public class D35PatikaDevJava101Odev28MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = inp.nextInt();
        int i = 1;
        int toplam = 0;
        while (i < num) {
            if (num % i == 0) {
                toplam += i;
                i++;
            } else {
                ++i;
            }
        }
        if (toplam == num){
            System.out.println(num+" bir mukemmel sayidir.");
        }else {
            System.out.println(num+" bir mukemmel sayi degildir.");
        }
    }
}
