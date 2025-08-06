package Day2_Constructors;
class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "";
        author = "";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
