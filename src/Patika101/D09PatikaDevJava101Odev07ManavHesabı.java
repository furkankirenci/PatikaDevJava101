package Patika101;
import java.util.Scanner;
public class D09PatikaDevJava101Odev07ManavHesabı {
    public static void main(String[] args) {
        double perarmut=2.14,perelma=3.67, perdomates=1.11, permuz = 0.95, perpatlican=5.00, armut,elma,muz,domates,patlican, toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız? : ");
        armut = inp.nextDouble();

        System.out.print("Kaç kilo elma aldınız? : ");
        elma = inp.nextDouble();

        System.out.print("Kaç kilo domates aldınız? : ");
        domates = inp.nextDouble();

        System.out.print("Kaç kilo muz aldınız? : ");
        muz = inp.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız? : ");
        patlican = inp.nextDouble();

        armut *= perarmut;
        elma *= perelma;
        muz *= permuz;
        patlican *= perpatlican;
        domates *= perdomates;

        System.out.println("Armut fiyatı : " + armut + "\nElma fiyatı : "+ elma + "\nDomates Fiyatı : "+ domates + "\nMuz Fiyatı : "+muz+ "\nPatlıcan Fiyatı : "+ patlican);

        toplam = armut+elma+domates+muz+patlican;
        System.out.println("toplam fiyat : " + toplam);

        }
    }

