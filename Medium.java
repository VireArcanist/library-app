public abstract class Medium {
    String title;
    int year;
    // Indicates whether the medium is currently lent out or not.
    boolean isLent = false;
    // Constructor to initialize the title and year of the medium.
    Medium(String title, int year) {
        this.title = title;
        this.year = year;
        this.isLent = false;
    }
    // Method to display information about the medium, including its title, year, and lending status.
    public void showInfo() {
        // Print the title and year of the medium, along with its lending status (either "Lent out" or "Available").
        System.out.println(title + " (" + year + ") - " + (isLent ? "Lent out" : "Available"));
    }
}
