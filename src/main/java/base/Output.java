package base;

public class Output {

    static public void printOutput(int people, int pizza, int totalSlices, int slicePerson, int leftOvers) {
        System.out.format("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.\n", people, pizza, totalSlices, slicePerson, leftOvers);
    }
}
