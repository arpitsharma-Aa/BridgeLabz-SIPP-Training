package Day3_ObjectRelationship;
class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("KA01AB1234", "Arjun", "Car");
        Vehicle v2 = new Vehicle("KA02CD5678", "Neha", "Bike");

        if (v1 instanceof Vehicle) {
            System.out.println("Registration Number: " + v1.registrationNumber);
            System.out.println("Owner Name: " + v1.ownerName);
            System.out.println("Vehicle Type: " + v1.vehicleType);
            System.out.println("Registration Fee: " + Vehicle.registrationFee);
        }

        if (v2 instanceof Vehicle) {
            System.out.println("Registration Number: " + v2.registrationNumber);
            System.out.println("Owner Name: " + v2.ownerName);
            System.out.println("Vehicle Type: " + v2.vehicleType);
            System.out.println("Registration Fee: " + Vehicle.registrationFee);
        }

        Vehicle.updateRegistrationFee(5500.0);
        System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);
    }
}

