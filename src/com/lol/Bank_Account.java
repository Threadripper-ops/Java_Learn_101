package com.lol;

import java.util.ArrayList;

// BankAccount class
class BankAccount {
    private String name;
    private int accountId;
    private static int numberOfAccounts = 0;
    private String userId;
    private String userPassword;
    private double accountBalance;

    public BankAccount(String name, String userId, String userPassword) {
        this.name = name;
        this.userId = userId;
        this.userPassword = userPassword;
        this.accountId = numberOfAccounts++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void decrementNumberOfAccounts() {
        numberOfAccounts--;
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {
    private double dailyWithdrawalLimit;

    public CheckingAccount(String name, String userId, String userPassword) {
        super(name, userId, userPassword);
        this.dailyWithdrawalLimit = 300.00;
    }

    public double getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
}

// Exception classes
class InvalidPasswordFormatException extends Exception {
    public InvalidPasswordFormatException(String message) {
        super(message);
    }
}

class NegativeDollarAmountException extends Exception {
    public NegativeDollarAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class CustomerAccountNotFoundException extends Exception {
    public CustomerAccountNotFoundException(String message) {
        super(message);
    }
}

