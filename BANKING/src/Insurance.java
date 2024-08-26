// The Insurance class extends the Bank class, inheriting its properties and methods
public class Insurance extends Bank {

    // Constructor for the Insurance class
    public Insurance() {
        // Call the constructor of the superclass (Bank) with specific values
        super("TM", 230351);
    }

    // Method to indicate that the insurance provides coverage
    public void cover() {
        // Print a message indicating that the insurance provides coverage
        System.out.println("You are covered");
    }
}
