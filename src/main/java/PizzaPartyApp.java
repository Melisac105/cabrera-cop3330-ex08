/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 8 - Pizza Party
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */

import base.Calculations;
import base.Output;
import base.UsrInput;

public class PizzaPartyApp {

    public static void main(String[] args) {
        int numPeople = UsrInput.getNumPeople();
        int numPizza = UsrInput.getNumPizzas();
        int numSlice = UsrInput.getNumSlices();
        int totalSlices = Calculations.calcTotalSlices(numPizza, numSlice);
        int slicePerson = Calculations.calcSlicePerson(totalSlices, numPeople);
        int leftOvers = Calculations.calcLeftOvers(totalSlices, numPeople);
        Output.printOutput(numPeople, numPizza, totalSlices, slicePerson, leftOvers);
    }


}
