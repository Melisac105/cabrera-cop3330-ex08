package base;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getNumPeople() {
        System.out.print("How many people? ");
        return input.nextInt();
    }

    static public int getNumPizzas() {
        System.out.print("How many pizzas do you have? ");
        return input.nextInt();
    }

    static public int getNumSlices() {
        System.out.print("How many slices per pizza? ");
        return input.nextInt();
    }
}
