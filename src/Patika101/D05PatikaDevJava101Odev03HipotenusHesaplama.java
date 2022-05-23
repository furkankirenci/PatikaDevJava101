package Patika101;
import java.util.Scanner;
public class D05PatikaDevJava101Odev03HipotenusHesaplama {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner giren = new Scanner(System.in);
        System.out.print("1. kenar nedir?: ");
        a = giren.nextInt();

        Scanner giren2 = new Scanner(System.in);
        System.out.print("2. kenar nedir?: ");
        b = giren2.nextInt();

        c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüsünüz: " + c);


    }
}
