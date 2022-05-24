package Patika101;

import java.util.Scanner;

public class D14PatikaDevJava101Odev10HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava Sicakligi Nedir? :");
        heat = input.nextInt();
        if (heat >= 25) {
            System.out.println("Yuzme");

        } else if (heat >= 15) {
            System.out.println("Piknik");

        } else if (heat < 15) {
            if (heat >= 10) {
                System.out.println("Piknik");

            }
            if (heat > 5 && heat <= 15) {
                System.out.println("Sinema");
            } else {
                System.out.println("Kayak");
            }


        }

    }

}

