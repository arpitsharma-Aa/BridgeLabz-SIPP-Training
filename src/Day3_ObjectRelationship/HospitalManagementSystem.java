package Day3_ObjectRelationship;
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static int getTotalPatients() {
        return totalPatients;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "John", 30, "Flu");
        Patient p2 = new Patient(102, "Alice", 25, "Infection");

        if (p1 instanceof Patient) {
            System.out.println("Patient ID: " + p1.patientID);
            System.out.println("Name: " + p1.name);
            System.out.println("Age: " + p1.age);
            System.out.println("Ailment: " + p1.ailment);
            System.out.println("Hospital: " + Patient.hospitalName);
        }

        if (p2 instanceof Patient) {
            System.out.println("Patient ID: " + p2.patientID);
            System.out.println("Name: " + p2.name);
            System.out.println("Age: " + p2.age);
            System.out.println("Ailment: " + p2.ailment);
            System.out.println("Hospital: " + Patient.hospitalName);
        }

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
