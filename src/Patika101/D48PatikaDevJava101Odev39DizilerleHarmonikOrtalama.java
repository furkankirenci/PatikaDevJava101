package Patika101;

public class D48PatikaDevJava101Odev39DizilerleHarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {5.0, 5.0, 4.0, 10.0, 8.0};
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += (1 / list[i]);
        }
        System.out.println((list.length/sum));
    }
}
