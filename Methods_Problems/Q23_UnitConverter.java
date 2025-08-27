public class Q23_UnitConverter {
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println(kmToMiles(10));
        System.out.println(milesToKm(6.2));
        System.out.println(metersToFeet(3));
        System.out.println(feetToMeters(9.8));
    }
}
