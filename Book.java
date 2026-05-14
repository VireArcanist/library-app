public class Book extends Medium implements Lendable {
    String author;
    // Constructor to initialize the title, year, and author of the book.
    Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }
    // Method to lend the book, which sets the isLent status to true.
    @Override
    public void lend() {
        if (isLent) {
            System.out.println("Sorry, " + title + " is already lent out.");
        } else {
            isLent = true;
            System.out.println("You have lent: " + title);
        }
    }
    // Method to return the book, which sets the isLent status to false.
    @Override
    public void returnItem() {
        if (isLent) {
            isLent = false;
            System.out.println("You have returned: " + title);
        }
    }
}   
