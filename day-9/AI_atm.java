import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount1 {

    private int balance;

    public BankAccount1(int initialBalance) {
        this.balance = initialBalance;
    }
    public int getBalance() {
        return this.balance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            return true; // Success
        }
        System.out.println("Deposit amount must be positive.");
        return false; // Failure
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false; // Failure
        }
        if (amount > this.balance) {
            System.out.println("Transaction Failed: Insufficient funds.");
            return false; // Failure
        }
        this.balance -= amount;
        return true; // Success
    }
}

public class AI_atm {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Start the account with a balance of 0
            BankAccount1 account = new BankAccount1(0);
            
            boolean isRunning = true;
            List<String> transactionHistory = new ArrayList<>();

            while (isRunning) {
                System.out.println("\n---------------ATM MENU-------------");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter Your Choice: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Current Balance: ₹" + account.getBalance());

                    case 2 -> {
                        System.out.print("Enter the Amount to Deposit: ");
                        int depositAmount = input.nextInt();
                        if (account.deposit(depositAmount)) {
                            System.out.println("Successfully deposited ₹" + depositAmount);
                            transactionHistory.add("Deposited: +₹" + depositAmount);
                        }
                    }

                    case 3 -> {
                        System.out.print("Enter the Amount to Withdraw: ");
                        int withdrawAmount = input.nextInt();
                        if (account.withdraw(withdrawAmount)) {
                            System.out.println("Successfully withdrew ₹" + withdrawAmount);
                            transactionHistory.add("Withdrew: -₹" + withdrawAmount);
                        }
                    }

                    case 4 -> {
                        System.out.println("\n--- Transaction History ---");
                        if (transactionHistory.isEmpty()) {
                            System.out.println("No transactions have been made yet.");
                        } else {
                            for (String transaction : transactionHistory) {
                                System.out.println(transaction);
                            }
                        }
                        System.out.println("-------------------------");
                    }

                    case 5 -> {
                        System.out.println("Thank you for using the ATM. Goodbye! 👋");
                        isRunning = false;
                    }

                    default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        }
    }
}