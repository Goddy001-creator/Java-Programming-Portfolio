package Session3.assignment03;

import java.util.Scanner;

public class AtmBankingEngine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1500.00;
        int authorizedPin = 2026;

        int attempts = 0;
        boolean authenticated = false;

        // PIN Authentication
        while (attempts < 3) {
            System.out.print("Enter Security PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == authorizedPin) {
                System.out.println("PIN Verified! Welcome, Account Holder #8921.");
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
            }
        }

        if (!authenticated) {
            System.out.println("Card locked. Too many incorrect PIN attempts.");
            System.exit(0);
        }

        int choice;
        boolean running = true;
        int transactionCount = 0;

        // ATM Menu
        do {

            System.out.println("\n--- MAIN TRANSACTION MENU ---");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Transaction Summary");
            System.out.println("5. Exit / Eject card");

            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        transactionCount++;

                        System.out.printf("SUCCESS: Deposited $%.2f%n", depositAmount);
                        System.out.printf("Updated Balance: $%.2f%n", balance);
                    } else {
                        System.out.println("ERROR: Deposit amount must be greater than $0.00.");
                    }

                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();

                    if (withdrawalAmount <= 0) {
                        System.out.println("ERROR: Withdrawal amount must be greater than $0.00.");

                    } else if (withdrawalAmount > balance) {
                        System.out.println("ERROR: Insufficient Funds.");

                    } else if (withdrawalAmount > 500.00) {
                        System.out.println("ERROR: Exceeds single-transaction limit of $500.00!");

                    } else {
                        balance -= withdrawalAmount;
                        transactionCount++;

                        System.out.printf("SUCCESS: Dispensing $%.2f cash.%n", withdrawalAmount);
                        System.out.printf("Updated Balance: $%.2f%n", balance);
                    }

                    break;

                case 4:
                    System.out.println("\n--- MINI-STATEMENT ---");
                    System.out.println("Total Transactions: " + transactionCount);
                    System.out.printf("Current Balance: $%.2f%n", balance);
                    break;

                case 5:
                    System.out.println("Thank you for banking with Apex National Bank! Card ejected.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        } while (running);
    }
}

