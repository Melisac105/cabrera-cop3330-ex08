package base;

public class Calculations {

    static public int calcTotalSlices(int pizza, int slice) {
        return pizza * slice;
    }

    static public int calcSlicePerson(int totalSlices, int person) {
        return totalSlices / person;
    }

    static public int calcLeftOvers(int totalSlices, int person) {
        return totalSlices % person;
    }
}
