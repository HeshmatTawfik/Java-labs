package lab3;

public class Task1 {

    public static void main(String[] args) {

        int matrix[][] = new int[4][4];
        int s;
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                System.out.println("----------");
                s = 1;
            } else {
                s = i + 1;
            }

            for (int j = 0; j < matrix.length; j++) {
                if (j == 0) {
                    matrix[i][j] = i;
                } else {
                    s = s + 4;
                }
                matrix[i][j] = s;
                System.out.print(matrix[i][j] + "|");


            }
            System.out.println();
            System.out.println("----------");
        }

    }
}
