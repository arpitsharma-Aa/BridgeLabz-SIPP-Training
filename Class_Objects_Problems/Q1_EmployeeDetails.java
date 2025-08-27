class Q1_EmployeeDetails {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Q1_EmployeeDetails emp = new Q1_EmployeeDetails();
        emp.name = "John";
        emp.id = 101;
        emp.salary = 45000.50;
        emp.displayDetails();
    }
}
