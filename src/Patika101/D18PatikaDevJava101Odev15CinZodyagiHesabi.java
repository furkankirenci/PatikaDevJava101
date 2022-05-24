package Patika101;
import java.util.Scanner;
public class D18PatikaDevJava101Odev15CinZodyagiHesabi {
    public static void main(String[] args) {
        int year;
        String cins;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dogum  Yiliniz Nedir? : ");
        year = inp.nextInt();
        year = year % 12;

        if(year==0){
            cins = "maymun";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==1){
            cins = "horoz";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==2){
            cins = "kopek";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==3){
            cins = "domuz";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==4){
            cins = "fare";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==5){
            cins = "okuz";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==6){
            cins = "kaplan";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==7){
            cins = "tavsan";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==8){
            cins = "ejderha";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==9){
            cins = "yilan";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==10){
            cins = "at";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }else if(year==11){
            cins = "koyun";
            System.out.println("Cin Zodyagi burcunuz : " + cins);
        }


    }
}
