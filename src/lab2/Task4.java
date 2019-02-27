package lab2;

import java.util.ArrayList;

/**
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of
 * the array to the screen.
 */
public class Task4 {
    public static int[] evenNumbers() {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 2; i <= 30; i++) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        int[] arr = even.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        for (int i : evenNumbers()) {
            System.out.println(i);
        }

    }
}
