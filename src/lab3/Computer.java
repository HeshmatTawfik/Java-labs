package lab3;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private int quantityCPU;
    private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;

    }

    /**
     * void method to print the computer details
     *
     * @see Computer#view()
     */
    public void view() {
        System.out.println("manufacturer:" + manufacturer + " serialNumber:" + serialNumber + " price:" + price +
                " quantityCPU:" + quantityCPU + " frequencyCPU:" + frequencyCPU);

    }

    /**
     * static method to create Computer array consist of 5 objects
     *
     * @see Computer#computerArray() )
     */
    public static Computer[] computerArray() {
        Computer computerObjects[] = new Computer[5];
        for (int i = 0; i < computerObjects.length; i++) {
            computerObjects[i] = new Computer("Hp " + i, i + 1, 500 * (i + 1), 1, 2500);
        }
        return computerObjects;
    }


}