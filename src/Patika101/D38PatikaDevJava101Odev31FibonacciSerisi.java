package Patika101;

import java.util.Scanner;

public class D38PatikaDevJava101Odev31FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli bir seri olacak : ");
        int basNum = input.nextInt();
        int toplam = 0;
        int a = 1, b = 0;
        if (basNum == 0){
            System.out.println(b);
        }else if(basNum == 2) {
            System.out.println(b);
            System.out.println(a);
        }else {
            System.out.println(b);
            System.out.println(a);
            int lastToplam = a+b;
            for (int i = 3; i <= basNum; i++) {
                toplam = a+b;
                b=a;
                a=toplam;
                System.out.println(toplam);
            }
        }
    }
}
