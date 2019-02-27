package lab2;

/**
 * Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
 * Also compute and display the average. The output shall look like:
 * The Sum is: 100
 * The Avg is: 10
 */
public class Task3 {
    public static void sumOfNumbers(int n) {
        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double average = sum / n;
        System.out.println("Sum =" + sum);
        System.out.println("Average =" + average);

    }

    public static void main(String[] args) {
        sumOfNumbers(13);

    }


}
