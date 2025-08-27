CLASS Book {
    STRING title
    INT yearPublished
    DOUBLE rating
}

LIST<Book> books = [
    Book("Java Basics", 2016, 4.7),
    Book("Python Guide", 2014, 4.9),
    Book("Algorithms", 2018, 4.3),
    Book("Modern Design", 2017, 4.6)
]

// Filter books published after 2015 with rating > 4.5
filteredBooks = books.stream()
                     .filter(book -> book.yearPublished > 2015 AND book.rating > 4.5)
                     .collect(toList())

FOR book IN filteredBooks
    PRINT book.title
