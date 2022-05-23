package Patika101;
import java.util.Scanner;
public class D07PatikaDevJava101Odev05DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        double r, alan, cevre, pi=3.14, tarali;
        Scanner input = new Scanner(System.in);
        System.out.println("yarıçap nedir? : ");
        r = input.nextDouble();

        cevre = 2*pi*r;
        alan = pi*r*r;

        System.out.println("Alanınız : "+ alan + "\nÇevreniz : "+ cevre);

        System.out.println("taralı açı nedir? : ");
        tarali = input.nextDouble();

        tarali = alan * tarali / 360;
        System.out.println("taralı alanınız : "+ tarali);

    }
}
