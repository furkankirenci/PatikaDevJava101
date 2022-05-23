package Patika101;

public class D10IfElseSwitchCaseKullanimi {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 6;
        if (var1 == 8) {
            ;
            System.out.print(var2);

        } else if (var1 <= 9) {
            System.out.println("davaro");

        } else
            System.out.print(++var2);

        switch (var2) {
            case 1:
                System.out.println("1 1dir");
                break;
            case 2:
                var2 = 4;
                System.out.println(var2);
                break;
            default:
                System.out.println("yarraaa");



        }
    }
}
