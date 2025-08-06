package Day3_ObjectRelationship;
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Riya", "A");
        Student s2 = new Student(102, "Kabir", "B+");

        if (s1 instanceof Student) {
            System.out.println("Roll Number: " + s1.rollNumber);
            System.out.println("Name: " + s1.name);
            System.out.println("Grade: " + s1.grade);
            System.out.println("University: " + Student.universityName);
        }

        if (s2 instanceof Student) {
            System.out.println("Roll Number: " + s2.rollNumber);
            System.out.println("Name: " + s2.name);
            System.out.println("Grade: " + s2.grade);
            System.out.println("University: " + Student.universityName);
        }

        Student.displayTotalStudents();
    }
}
