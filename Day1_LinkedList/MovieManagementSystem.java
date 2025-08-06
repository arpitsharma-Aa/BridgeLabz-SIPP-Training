package Day1_LinkedList;

public class MovieManagementSystem {

    static class MovieNode {
        String title;
        String director;
        int year;
        float rating;
        MovieNode next, prev;

        public MovieNode(String title, String director, int year, float rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    static class MovieDoublyLinkedList {
        MovieNode head, tail;

        void addAtEnd(MovieNode node) {
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        void addAtBeginning(MovieNode node) {
            if (head == null) {
                head = tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }

        void deleteByTitle(String title) {
            MovieNode temp = head;
            while (temp != null) {
                if (temp.title.equals(title)) {
                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = temp.prev;
                    if (temp.prev != null) temp.prev.next = temp.next;
                    if (temp.next != null) temp.next.prev = temp.prev;
                    break;
                }
                temp = temp.next;
            }
        }

        void updateRating(String title, float newRating) {
            MovieNode temp = head;
            while (temp != null) {
                if (temp.title.equals(title)) {
                    temp.rating = newRating;
                    break;
                }
                temp = temp.next;
            }
        }

        void displayForward() {
            MovieNode temp = head;
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
                temp = temp.next;
            }
        }

        void displayReverse() {
            MovieNode temp = tail;
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
                temp = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();

        movieList.addAtEnd(new MovieNode("Inception", "Nolan", 2010, 9.0f));
        movieList.addAtBeginning(new MovieNode("Interstellar", "Nolan", 2014, 8.3f));
        movieList.addAtEnd(new MovieNode("Avengers", "Whedon", 2012, 8.4f));

        System.out.println("Movies (Forward):");
        movieList.displayForward();

        movieList.updateRating("Avengers", 8.3f);
        System.out.println("\nAfter Rating Update:");
        movieList.displayForward();

        movieList.deleteByTitle("Inception");
        System.out.println("After Deletion:");
        movieList.displayForward();

        System.out.println("Movies (Reverse):");
        movieList.displayReverse();
    }
}