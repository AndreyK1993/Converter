package app;

public class Converter {
    public static void main(String[] args) {
        
        double miles = 50;

        printMilesToKm(miles);
    }
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }
    public static void printMilesToKm(double miles) {
        double result = milesToKm(miles);
        System.out.println(miles + " miles is equal to " + result + " kilometers");
    }
}
