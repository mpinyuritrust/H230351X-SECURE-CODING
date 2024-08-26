public class Bank {
    // Private fields to store the account type and balance
    private String accountType;
    private double accountBalance;

    // Method to deposit money into the account
    public double deposit(double amount) {
        // Add the deposit amount to the account balance
        accountBalance += amount;
        // Return the updated account balance
        return accountBalance;
    }

    // Method to withdraw money from the account
    public double withdrawal(double amount) {
        // Subtract the withdrawal amount from the account balance
        accountBalance -= amount;
        // Return the updated account balance
        return accountBalance;
    }

    // Constructor to initialize the Bank object with account type and balance
    public Bank(String initials, double accountBalance) {
        this.accountType = initials; // Set the account type
        this.accountBalance = accountBalance; // Set the initial account balance
    }

    // Method to display the account type and balance
    public void display() {
        // Print out the account type and current balance
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
