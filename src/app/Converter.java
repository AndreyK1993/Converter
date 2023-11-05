package app;

public class Converter {
    public static void main(String[] args) {

        double kilometers = 100;

        printKmToMiles(kilometers);
    }
    public static double KmToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
    public static void printKmToMiles(double kilometers) {
        double result = KmToMiles(kilometers);
        System.out.printf("%.2f kilometers is equal to %.2f miles",
                kilometers, result);

    }
}
