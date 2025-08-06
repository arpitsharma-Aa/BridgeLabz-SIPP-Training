package Day3_ObjectRelationship;
class Book {
    static String libraryName = "Central Library";
    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Inferno", "Dan Brown");
        Book b2 = new Book("ISBN002", "1984", "George Orwell");

        if (b1 instanceof Book) {
            System.out.println("ISBN: " + b1.isbn);
            System.out.println("Title: " + b1.title);
            System.out.println("Author: " + b1.author);
        }

        if (b2 instanceof Book) {
            System.out.println("ISBN: " + b2.isbn);
            System.out.println("Title: " + b2.title);
            System.out.println("Author: " + b2.author);
        }

        Book.displayLibraryName();
    }
}
