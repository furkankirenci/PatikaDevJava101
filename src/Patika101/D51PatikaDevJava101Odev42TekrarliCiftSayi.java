package Patika101;

import java.util.Arrays;

public class D51PatikaDevJava101Odev42TekrarliCiftSayi {
    public static void main(String[] args) {
        int[] list = {54, 56, 0, 0, 1, 1, 5, 0, 526, 2, 8, 56, 5, 2, 4};
        int[] duplicate = new int[list.length];
        int start = 0;
        int sayac = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    duplicate[start++] = list[i];
                    sayac++;
                    break;
                }
            }
        }
        for (int k = 0; k < sayac; k++) {
            System.out.println(duplicate[k]);
//Tekrar eden her değer 1 defa yazılabilir hocanın yoluyla.
//Fakat dizide sıfır değeri de tekrarlandığı için doğru bir kullanım değildir.
        }
    }
}

