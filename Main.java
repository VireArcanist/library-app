public class Main {
    public static void main (String[] args) {
        // Create a librarian to manage the library's collection.
        Librarian librarian = new Librarian();
        // Create some books and DVDs to add to the library's collection.
        Book book1 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", 1960, "Harper Lee");
        DVD dvd1 = new DVD("Inception", 2010, 148);
        DVD dvd2 = new DVD("The Matrix", 1999, 136);
         // Add the books and DVDs to the librarian's collection.
        librarian.addMedium(book1);
        librarian.addMedium(book2);
        librarian.addMedium(dvd1);
        librarian.addMedium(dvd2);
        // Display all media items in the library's collection, showing their information and lending status.
        librarian.showAll();
        // Lend out a book and a DVD to demonstrate the lending functionality.
        book1.lend();
        book1.lend(); // Attempt to lend the same book again to show the error message.
        dvd1.lend();
    }
}
