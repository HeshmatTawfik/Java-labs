package lab3;

import static lab3.Computer.computerArray;

/**
 * Add to class Computer method void view (){} that prints all fields of object in line.
 * Print all info (fields) of all objects in console.
 *
 * @see Computer#computerArray()
 * @see Computer#view()
 */
public class Task6 {
    public static void main(String[] args) {
        for (Computer computer : computerArray()) {
            computer.view();
        }
    }
}
