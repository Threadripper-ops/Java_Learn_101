package com.lol;

import java.util.ArrayList;

// Usage example
public class Main {
    public static void main(String[] args) {
        try {
            CheckingAccount account = new CheckingAccount("Harsh Patel", "harshpat123", "password123");
            account.setAccountBalance(500.00);

            System.out.println("Account Name: " + account.getName());
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Number of Accounts: " + BankAccount.getNumberOfAccounts());

            // Demonstrate exception handling
            if (account.getUserPassword().length() < 8 || !account.getUserPassword().contains("**")) {
                throw new InvalidPasswordFormatException("Invalid password format.");
            }

            double withdrawalAmount = -100.00;
            if (withdrawalAmount < 0) {
                throw new NegativeDollarAmountException("Negative dollar amount entered.");
            }

            if (withdrawalAmount > account.getAccountBalance()) {
                throw new InsufficientFundsException("Insufficient funds.");
            }

            // Simulating a search for a customer account in a list
            ArrayList<BankAccount> accounts = new ArrayList<>();
            accounts.add(account);

            String searchUserId = "johndoe123";
            String searchUserPassword = "password123";

            boolean accountFound = false;
            for (BankAccount bankAccount : accounts) {
                if (bankAccount.getUserId().equals(searchUserId) && bankAccount.getUserPassword().equals(searchUserPassword)) {
                    accountFound = true;
                    break;
                }
            }

            if (!accountFound) {
                throw new CustomerAccountNotFoundException("Customer account not found.");
            }
        } catch (InvalidPasswordFormatException | NegativeDollarAmountException |
                 InsufficientFundsException | CustomerAccountNotFoundException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            BankAccount.decrementNumberOfAccounts();
        }
    }
}
