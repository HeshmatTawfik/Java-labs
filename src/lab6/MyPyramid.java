package lab6;

/*
*  1
  121
 12321
1234321*/
public class MyPyramid {
    public static void main(String[] args) {
        printPyramid(5);
    }

    public static void printPyramid(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j == i && j != 1) {
                    for (int z = j - 1; z >= 1; z--) {
                        System.out.print(z);
                    }
                }

            }
            System.out.println();
        }

    }
}
