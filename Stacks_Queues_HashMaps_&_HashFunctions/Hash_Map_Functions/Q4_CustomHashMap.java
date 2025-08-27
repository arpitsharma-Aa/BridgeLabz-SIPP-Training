import java.util.Scanner;

class Node {
    int key, value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Q4_CustomHashMap {
    private final int SIZE = 10;
    private Node[] table;

    public Q4_CustomHashMap() {
        table = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public Integer get(int key) {
        int index = hash(key);
        Node head = table[index];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Node head = table[index], prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) table[index] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Q4_CustomHashMap map = new Q4_CustomHashMap();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Put  2.Get  3.Remove  0.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter key and value: ");
                    map.put(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    Integer val = map.get(sc.nextInt());
                    System.out.println(val != null ? "Value: " + val : "Key not found.");
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    map.remove(sc.nextInt());
                    break;
            }
        } while (choice != 0);
    }
}
