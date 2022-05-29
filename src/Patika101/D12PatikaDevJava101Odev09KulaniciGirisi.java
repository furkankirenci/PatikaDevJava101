package Patika101;

import java.util.Scanner;

public class D12PatikaDevJava101Odev09KulaniciGirisi {
    public static void main(String[] args) {
        String username, password;
        int secim;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adi Giriniz: ");
        username = input.nextLine();

        System.out.println("Sifre Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") || password.equals("java101")) {
            System.out.println("Giris Basarili");
        } else {
            System.out.println("Kullanici Adi veya Sifre Yanlis");
            System.out.println("Sifrenizi Degistirmek Ister Misiniz? : \n1-Evet\n2-Hayir");
            secim = input.nextInt();
            if (secim == 2){
                System.out.print("Lutfen Tekrar Giris Yapiniz.");
            } else if (secim == 1) {
                String newpassword;
                System.out.print("Yeni Sifrenizi Giriniz : ");
//sebebini öğren!! neden newpassword en basta yazinca bu scope icinde gecerli olmadi? secim geçerli olmustu.
                Scanner input2 = new Scanner(System.in);
                newpassword = input2.nextLine();

                if (newpassword.equals("java101")) {
                    System.out.println("Sifreniz Eski Sifreniz Ile Ayni Olamaz.");
                }else{
                    System.out.println("Sifreniz Basari Ile Degistirildi");
                }


            }else {
                System.out.println("Secim Gecersiz");
            }

        }

    }
}









