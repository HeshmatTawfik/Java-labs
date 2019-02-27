package lab3;

public class Task2 {
    public static int binarySearch(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - 1) / 2;

            if (arr[middle] == x) {
                System.out.println("index of " + x + " is " + middle);
                return middle;
            }
            if (arr[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("x is not found");
        return -1;
    }

    public static void main(String[] args) {
        int a[] = new int[]{0, 1, 2, 3, 4, 5};
        binarySearch(a, 6);
    }
}
