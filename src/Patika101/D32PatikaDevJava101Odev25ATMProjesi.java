package Patika101;

import java.util.Scanner;

public class D32PatikaDevJava101Odev25ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 5000;
        int select = 0;
        int price;
        while (right != 0) {
            System.out.print("Kullanici Adi Giriniz : ");
            userName = input.nextLine();
            System.out.print("Sifre Giriniz : ");
            password = input.nextLine();
            if (userName.equals("a") && (password.equals("a"))) {
                System.out.println("Sisteme giris yapildi");
                do {

                    System.out.println("1-Bakiye Sorgulama\n" +
                            "2-Para Yatirma\n" +
                            "3-Para Cekme\n" +
                            "4-Cikis Yap\n" +
                            "Islem turunu seciniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Yatirmak istediginiz ucret nedir ? : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            break;
                        case 3:
                            System.out.println("Cekmek istediginiz ucret nedir ? : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Hatali para miktari girdiniz.");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz : " + balance);
                            }
                            break;
                    }
                    if ((select < 1) || (select > 4)) {
                        System.out.println("Lutfen gecerli bir islem giriniz.");
                        break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Gorusmek Uzere Baskanim..");
                break;
            } else {
                right--;
                if (right != 0) {
                    System.out.println("tekrar deneyiniz");
                    System.out.println("kalan hakkiniz : " + right);
                } else
                    System.out.println("Hesabiniz Bloke Edilmistir.");
            }
        }
    }
}

