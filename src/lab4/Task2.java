package lab4;

public class Task2 {
    public static void main(String[] args) {

        Matrix m = new Matrix();
        m.matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        m.addTwoMatrices(m.matrix, m.matrix);
        m.multiplyMatrices(m.matrix, m.matrix, 2, 2, 2);
    }
}
