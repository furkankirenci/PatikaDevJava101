package Patika101;

import java.util.Scanner;

public class D13PatikaDevJava101Odev10SınıfGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyo, geo;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Mat notunuzu giriniz: ");
        mat = input.nextInt();
        mat = ((mat < 0) || (mat > 100)) ? 0 : mat;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        fizik = ((fizik < 0) || (fizik > 100)) ? 0 : fizik;

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        kimya = ((kimya < 0) || (kimya > 100)) ? 0 : kimya;

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyo = input.nextInt();
        biyo = ((biyo < 0) || (biyo > 100)) ? 0 : biyo;

        System.out.print("Geometri notunuzu giriniz: ");
        geo = input.nextInt();
        geo = ((geo < 0) || (geo > 100)) ? 0 : geo;

        ortalama = (mat + fizik + kimya + biyo + geo) / 5;
        System.out.println("Ortalamaniz : " + ortalama);
        if (ortalama < 55) {
            System.out.println("Kaldi");
        } else {
            System.out.println("Gecti");
        }


    }
}

