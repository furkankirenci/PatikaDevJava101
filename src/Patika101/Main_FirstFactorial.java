package Patika101.D58PatikaDevJava101CoderbyteChallengeCevaplari;
import java.util.Scanner;
public class Main_FirstFactorial {
    public static int FirstFactorial(int num) {
        int total = 1;
        while(num>0){
            total*= num;
            num--;
        }
        num = total;
        return total;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int total = 1;
        while(num>0){
            total*= num;
            num--;
        }
        System.out.println(total);
    }
    }

