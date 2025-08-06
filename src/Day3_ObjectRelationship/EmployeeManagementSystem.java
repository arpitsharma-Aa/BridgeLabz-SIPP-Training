package Day3_ObjectRelationship;
class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Meera", "Developer");
        Employee e2 = new Employee(2, "Raj", "Manager");

        if (e1 instanceof Employee) {
            System.out.println("ID: " + e1.id);
            System.out.println("Name: " + e1.name);
            System.out.println("Designation: " + e1.designation);
            System.out.println("Company: " + Employee.companyName);
        }

        if (e2 instanceof Employee) {
            System.out.println("ID: " + e2.id);
            System.out.println("Name: " + e2.name);
            System.out.println("Designation: " + e2.designation);
            System.out.println("Company: " + Employee.companyName);
        }

        Employee.displayTotalEmployees();
    }
}
