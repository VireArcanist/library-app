// The DVD class extends the Medium class and implements the Lendable interface, representing a DVD in a library system.
public class DVD extends Medium implements Lendable {
   int duration; // Duration of the DVD in minutes
    // Constructor to initialize the title, year, and duration of the DVD.
    DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }
    // Method to lend the DVD, which sets the isLent status to true.
    @Override
    public void lend() {
        if (isLent) {
            System.out.println("Sorry, " + title + " is already lent out.");
        } else {
            isLent = true;
            System.out.println("You have lent: " + title);
        }
    }
    // Method to return the DVD, which sets the isLent status to false.
    @Override
    public void returnItem() {
        if (isLent) {
            isLent = false;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println(title + " was not lent out.");
        }
    }
}
