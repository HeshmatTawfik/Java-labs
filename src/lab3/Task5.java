package lab3;

import static lab3.Computer.computerArray;

public class Task5 {
    public static void main(String[] args) {
        Computer[] computer = computerArray();
        System.out.println("prices before increasing prices");
        for (Computer s : computerArray()) {
            s.view();
        }
        for (int i = 0; i < computer.length; i++) {
            computer[i].setPrice((computer[i].getPrice() + ((computer[i].getPrice() * 10) / 100)));
        }
        System.out.println("prices after increasing prices");

        for (Computer c : computer) {
            c.view();
        }
    }
}
