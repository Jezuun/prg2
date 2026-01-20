import java.util.*;
public class account {
    private int accountNumber;
    private String name;
    private double amt;

    private static int numberOfAccounts = 0;

    public account() {numberOfAccounts++; }

    public account(int accountNumber, String name, double amt) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amt = amt;
        numberOfAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getAmt() {
        return amt;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber < 10 || accountNumber > 100) {
            System.out.println("Invalid account number. Must be between 10 and 100.");
            return;
        }
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name. It cannot be empty.");
            return;
        }
        this.name = name;
    }
    public void setAmt(double amt) {
        if (amt < 0) {
            System.out.println("Invalid amount. Cannot be negative.");
            return;
        }
        this.amt = amt;
    }

    public void deposit(double value) {
        if (value > 0) {
            amt += value;
        }
    }

    public void withdraw(double Value) {
       if (Value > 0 && Value <= amt) {
           amt -= Value;
       }

       }


    public void interestCalc(double Value) {
    Value = 1.02;
    amt = amt * Value;
    }

    @Override
    public String toString() {
        return String.format("Account Number : " + accountNumber + " Name : " + name + " Amount : " + amt) ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        account account = (account) obj;
        return accountNumber == account.accountNumber &&
                Objects.equals(name, account.name) &&
                account.amt == amt;
    }

    }

