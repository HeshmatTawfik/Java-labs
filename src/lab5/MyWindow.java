package lab5;

final public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private boolean isOpen;
    private String color;


    //Task 5
    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

/**Task 5*/

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

/**Task 6*/
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    /**Task 5*/
    public MyWindow() {
        this.width = 3.5;
        this.height = 3.5;
        this.color = "white";
        this.numberOfGlass = 2;
        this.isOpen = true;
    }

    public void printFields() {
        System.out.format("window height:%s, width:%s, number of glass:%s, color:%s, state:%s \n", height, width, numberOfGlass, color, isOpen);


    }

}