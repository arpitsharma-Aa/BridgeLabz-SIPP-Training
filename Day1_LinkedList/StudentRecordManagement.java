package Day1_LinkedList;
public class StudentRecordManagement {

    static class StudentNode {
        int rollNo;
        String name;
        int age;
        String grade;
        StudentNode next;

        public StudentNode(int rollNo, String name, int age, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    static class StudentLinkedList {
        StudentNode head;

        void addAtBeginning(StudentNode newNode) {
            newNode.next = head;
            head = newNode;
        }

        void addAtEnd(StudentNode newNode) {
            if (head == null) {
                head = newNode;
                return;
            }
            StudentNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        void addAtPosition(StudentNode newNode, int pos) {
            if (pos == 0) {
                addAtBeginning(newNode);
                return;
            }
            StudentNode temp = head;
            for (int i = 0; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        void deleteByRollNo(int rollNo) {
            if (head == null) return;
            if (head.rollNo == rollNo) {
                head = head.next;
                return;
            }
            StudentNode temp = head;
            while (temp.next != null && temp.next.rollNo != rollNo) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        void updateGrade(int rollNo, String newGrade) {
            StudentNode temp = head;
            while (temp != null) {
                if (temp.rollNo == rollNo) {
                    temp.grade = newGrade;
                    break;
                }
                temp = temp.next;
            }
        }

        void display() {
            StudentNode temp = head;
            while (temp != null) {
                System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        studentList.addAtEnd(new StudentNode(1, "Arpit", 20, "A"));
        studentList.addAtBeginning(new StudentNode(2, "Shivansh", 21, "B"));
        studentList.addAtPosition(new StudentNode(3, "Adi", 19, "A+"), 1);

        System.out.println(" All Students: ");
        studentList.display();

        studentList.updateGrade(2, "A");
        System.out.println(" After Updating Grade: ");
        studentList.display();

        studentList.deleteByRollNo(3);
        System.out.println("After Deleting Roll No 3: ");
        studentList.display();
    }
}