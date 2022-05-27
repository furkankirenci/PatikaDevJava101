package Patika101;

import java.util.Scanner;

public class D30PatikaDevJava101Odev23HarmonikSayi {
    public static void main(String[] args) {
        // (1/n) + (1/(n+1) + .... şeklindeki harmonik işlemin sonucunu hesaplıyoruz.
        Scanner inp = new Scanner(System.in);

        double num , total = 0;
        System.out.println("sayi gir : ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++) {
            total += (1.0 / i);
        }
        System.out.println(total);
    }
}
