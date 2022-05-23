package Patika101;
import java.util.Scanner;
public class D08PatikaDevJava101Odev06VucutKitleİndeksi {
    public static void main(String[] args) {
        double kilo, boy, indeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("kilo (kg) : ");
        kilo = inp.nextDouble();

        System.out.print("Boy (m) : ");
        boy = inp.nextDouble();

        indeks = kilo / boy /boy;

        System.out.println("Vücut Kitle İndeksiniz : "+ indeks);

    }
}
