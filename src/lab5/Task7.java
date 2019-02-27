package lab5;

public class Task7 {
    public static void main(String[] args) {
        MyWindow[] arr = new MyWindow[4];
        arr[0] = new MyWindow(1, 1, 1, "red", false);
        arr[1] = new MyWindow(1, 1);
        arr[2] = new MyWindow(1, 1, 1);
        arr[3] = new MyWindow();
        for (MyWindow myWindow : arr) {

            myWindow.printFields();
        }


    }
}
