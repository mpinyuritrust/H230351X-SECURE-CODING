public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank bank = new Bank("TM", 230351);

        // Create an instance of the Insurance class to call the cover method
        Insurance insurance = new Insurance();

        // Call the cover method to print "You are covered"
        insurance.cover();

        // Call the display method to print the account type and balance
        bank.display();
    }
}
