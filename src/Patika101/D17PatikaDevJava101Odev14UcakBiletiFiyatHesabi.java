package Patika101;

import java.util.Scanner;

public class D17PatikaDevJava101Odev14UcakBiletiFiyatHesabi {
    public static void main(String[] args) {
        int age, cins;
        double km, perKm = 0.1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yasiniz nedir? : ");
        age = inp.nextInt();

        System.out.print("Yolculuk kac kilometre? : ");
        km = inp.nextInt();

        System.out.println("Yolculuk turu nedir?\n1-Tek yok\n2-Gidis Donus");
        cins = inp.nextInt();

        km *= perKm;

        if (age < 12) {
            km *= 0.5;
        } else if (age < 24) {
            km *= 0.9;
        } else if (age >= 65) {
            km *= 0.7;
        } switch (cins){
            case 1:
                km=km;
                break;

            case 2:
                km = 2*(km*0.8);
                break;
            default:
                System.out.println("Hatali Giris");

        }if (km<0){
            System.out.println("Hatali Km Değeri");
        }if ((cins==1) || (cins==2)){
            System.out.println("Ucret "+ km + " TL");
        }

    }


}

