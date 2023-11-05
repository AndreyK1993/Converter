package app;

public class Converter {
    public static void main(String[] args) {

        double kilometers = 100;
        double miles = 50;

        printKmToMiles(kilometers);
        printMilesToKm(miles);
    }
    public static double KmToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
    public static double MilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static void printKmToMiles(double kilometers) {
        double result = KmToMiles(kilometers);
        System.out.printf("%.2f kilometers is %.2f miles \n",
                kilometers, result);

    }
    public static void printMilesToKm(double miles) {
        double result = MilesToKm(miles);
        System.out.printf(" %.2f miles is %.2f kilometers",
                miles, result);

    }
}
