package Patika101;

public class D56PatikaDevJava101Odev47PalindromKelime {
    static boolean isPalindrom(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            System.out.println(str.charAt(i));
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrom("ata"));
    }
}
