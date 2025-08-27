public class Q22_UnitConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(98.6));
        System.out.println(celsiusToFahrenheit(37));
        System.out.println(poundsToKg(100));
        System.out.println(kgToPounds(45.5));
        System.out.println(gallonsToLiters(2));
        System.out.println(litersToGallons(10));
    }
}
