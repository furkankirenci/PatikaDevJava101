package Patika101;


import java.util.Scanner;


public class D06PatikaDevJava101Odev04Taksimetre {
    public static void main(String[] args) {
        System.out.println(2 + 1);


        double km, acilis, tutar, kmtutari;

        acilis = 10.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometre yol gidildi?: ");
        km = input.nextDouble();

        kmtutari = km * 2.2;

        tutar = acilis + kmtutari;

        boolean kosul1 = tutar > 20;
        double ucret = kosul1 ? tutar : 20;
        System.out.println("Ücretiniz " + ucret + " Türk Lirası");


    }


}



