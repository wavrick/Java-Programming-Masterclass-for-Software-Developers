package com.Section6_OOP_Part_1;

public class Account {

    private String Number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;

    public Account() {
        this("12345",
                0.0,
                "Default",
                "Default",
                "Default");
        System.out.println("Empty Constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        Number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerPhoneNumber;

    public String getAccountNumber() {
        return Number;
    }

    public void setAccountNumber(String Number) {
        this.Number = Number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmailAddress;
    }

    public void setEmail(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        if (balance - amount < 0){
            System.out.println("Only " + balance + " available. Withdraw not processed.");
        } else {
            balance -= amount;
            System.out.println("Withdraw of " + amount + " processed. Remaining balance = " + balance);
        }

    }

}
