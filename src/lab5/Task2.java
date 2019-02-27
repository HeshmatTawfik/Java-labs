package lab5;

public class Task2 extends Rectangle {
    public static void main(String[] args) {

    }

    public static void finalArgument(final double A) {
        Circle circle = new Circle();
        //final argument can't be reassigned
        // a=circle.calcArea(Math.PI,3);
    }
}

class Circle extends Shape {
    @Override
    public double calcArea(final double pi, double r) {
        double area = pi * Math.pow(r, 2);
        System.out.println("Area of circle =" + area);
        return area;
    }
}

class Rectangle extends Shape {
    @Override
    public double calcArea(double l, double w) {
        return l * w;
    }


}

class Shape {
    public double calcArea(double a, double b) {
        return a * b;
    }
}
