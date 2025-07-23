package Operators;

public class BankAccount {
    public static void main(String[] args) {
        // Account holder details
        String accountHolderName = "Sachith";
        double balance = 2000.0;
        double depositAmount = 1500.0;
        double withdrawalAmount = 1000.0;
        byte numOfTransactions = 0;
        //boolean isActive = true;
        double MIN_BALANCE = 500.0;

        // Arithmetic operators: Deposit and withdrawal
        balance = balance + depositAmount; // Deposit(Arithmetic operators)
        numOfTransactions++; // Increment operator
        balance = balance - withdrawalAmount; // Withdraw(Arithmetic operators)
        numOfTransactions++; // Increment operator

        boolean isActive = numOfTransactions>0;

        // Relational operator: Check balance against minimum
        boolean isBelowMin = balance < MIN_BALANCE; // Relational operator

        // Logical operator: Combine account status and balance check
        boolean accountStatus = isActive && !isBelowMin; // Logical operator

        // Print account details
        System.out.println("--- Account Summary ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Balance: " + balance);
        System.out.println("Number of Transactions: " + numOfTransactions);
        System.out.println("Is Balance Below Minimum: " + isBelowMin);
        System.out.println("Active: "+isActive);
    }
}

