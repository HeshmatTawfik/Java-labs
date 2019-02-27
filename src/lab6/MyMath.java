package lab6;

import java.util.Arrays;
public class MyMath {
    private final static double pi =3.14;
    public static int findMax(int[] arr) {
        int max =Arrays.stream(arr).max().getAsInt();
        System.out.println("maximum number is :"+max);
        return max;
    }
//task
    public static int findMin(int[] arr) {
        int minimum= Arrays.stream(arr).min().getAsInt();
        System.out.println("minimum number is :"+minimum);
        return minimum;
    }
    public static void areaOfCircle (double r){
        double area =pi*(r*r);
        System.out.println("Area of the circle ="+area);
    }


}
