package Patika101;

public class D40PatikaDevJava101Odev32PalindromSayi {
    static void isPalindrom(int number) {
        int tempNumber, reverseNumber = 0, lastNumber;
        tempNumber = number;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            tempNumber /= 10;
        }
        if (reverseNumber == number){
            System.out.println(number+" Palindromdur.");
        }else {
            System.out.println(number+" Palindrom degildir.");
        }

    }

    public static void main(String[] args) {
        isPalindrom(12344321); ;
    }
}
