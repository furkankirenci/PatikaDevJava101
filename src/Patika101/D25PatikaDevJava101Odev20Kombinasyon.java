package Patika101;

import java.util.Scanner;

public class D25PatikaDevJava101Odev20Kombinasyon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r = 0;

        System.out.println("n nedir?");
        n = sc.nextInt();

        do {
            System.out.println("r nedir?");
            r = sc.nextInt();
        } while (r > n);

        int totaln = 1, totalr = 1, totalk = 1;

        for (int i = 1; i <= n; i++) {
            totaln *= i;
        }
        System.out.println("n farktoriyel : " + totaln);

        for (int j = 1; j <= r; j++) {
            totalr *= j;
        }
        System.out.println("r farktoriyel : " + totalr);

        for (int k = 1; k <= (n - r); k++) {
            totalk *= k;
        }
        System.out.println("(n-r) farktoriyel : " + totalk);

        System.out.println("n'in r'li kombinasyonu : " + totaln / (totalr * totalk));
    }
}
