package lab6;

import static lab6.MyMath.findMax;
import static lab6.MyMath.findMin;

public class Task2 {
    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        findMax(calculation.arr1);
        findMin(calculation.arr1);
        findMax(calculation.arr2);
        findMin(calculation.arr2);


    }
}
class Calculation{
    int arr1[]=new int[]{5,7,9,13,12};
    int arr2[]=new int[]{3,20,90,8,0,-1};

}