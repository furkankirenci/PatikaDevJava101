package Patika101;

import java.util.Scanner;

public class D44PatikaDevJava101Odev35RecursiveOruntu {
    static int oruntu(int n, int i) {
        if (n > 0) {
            System.out.println(n);
            i++;
            return oruntu(n - 5, i);

        } else {
            System.out.println(n);
            for (i = i; i > 1; i--) {
                n += 5;
                System.out.println(n);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi  giriniz : ");
        int n = input.nextInt();
        oruntu(n, 1);
    }
}
