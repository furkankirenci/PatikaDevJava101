package Patika101;

public class D21ContinueBreak {
    public static void main(String[] args) {

        for (int i = 1; i <= 2; ++i) {
            System.out.println("sa");
            for (int j = 1; j < 4; ++j) {
                System.out.println("check");
                if (i == 1) continue;
                System.out.println("point");
                System.out.print(i + j);
            }
        }
        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3) {
                break;
            }
        }
    }
}