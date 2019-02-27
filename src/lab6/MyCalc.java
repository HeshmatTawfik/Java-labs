package lab6;

import java.math.BigDecimal;
import java.math.RoundingMode;
//task 5
public class MyCalc {
    public static void main(String[] args) {

        calcPi(100);
    }

    public static double calcPi(int n) {
        double pi = 0;
        double denominator = 1;
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                pi = pi + (1 / denominator);
            } else {
                pi = pi - (1 / denominator);
            }
            denominator = denominator + 2;
        }
        pi = pi * 4;
        System.out.println(pi);
        return pi;
    }


}
