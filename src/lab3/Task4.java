package lab3;

import static lab3.Computer.computerArray;

public class Task4 {


    public static void main(String[] args) {
        /**@see Computer#computerArray() */
        for (Computer c : computerArray()) {
            c.view();
        }
    }
}

