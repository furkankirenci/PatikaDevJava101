package Patika101;

import java.util.Scanner;

public class D03PatikaDevJava101Odev01OrtalamaHesaplama {
    public static void main(String[] args) {


        // @outhor furkankirenci
        int mat,fizik,kimya,biyo,geo,tarih,beden;
        Scanner furkan = new Scanner(System.in);
        System.out.print("Matematik notunuz nedir? ");
        mat = furkan.nextInt();


        System.out.print("Fizik notunuz nedir? ");
        fizik = furkan.nextInt();

        System.out.print("Kimya notunuz nedir? ");
        kimya = furkan.nextInt();

        System.out.print("Biyoloji notunuz nedir? ");
        biyo = furkan.nextInt();

        System.out.print("Geometri notunuz nedir? ");
        geo = furkan.nextInt();

        System.out.print("Tarih notunuz nedir? ");
        tarih = furkan.nextInt();

        System.out.print("Beden Eğitimi notunuz nedir? ");
        beden = furkan.nextInt();

                int toplam = (mat+beden+biyo+kimya+tarih+fizik+geo);
                double sonuc = toplam/7.0;
        System.out.println("Ortalamanız : " + sonuc);

        boolean durum = sonuc >= 60;
        String gectikaldi = durum ? "Geçti" : "Kaldi" ;
        System.out.println("Durumunuz : " + gectikaldi);
        }

    }

