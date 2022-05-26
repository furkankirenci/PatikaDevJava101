package Patika101;

import java.util.Scanner;

public class D24PatikaDevJava101Odev19DortVeBesinKuvetleri {
    public static void main(String[] args) {
        /*Java döngüler ile girilen sayıya kadar olan
        4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
        Scanner scan = new Scanner(System.in);
        int n;
        n= scan.nextInt();

        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }

        for (int i = 1; i <= n; i *= 5){
            System.out.println(i);
        }
    }
}
