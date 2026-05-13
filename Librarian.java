// polymorphism example
import java.util.ArrayList;
// The Librarian class manages a collection of media items (books and DVDs) in a library system.
public class Librarian {
    ArrayList<Medium> media = new ArrayList<>();
    // Method to add a medium (either a book or a DVD) to the library's collection.
    public void addMedium(Medium medium) {
        media.add(medium);
    }

    public void showAll() {
        for (Medium medium: media) {
            medium.showInfo();
        }
    }

}
