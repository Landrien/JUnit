package Junit1.Bank;

public class BankAccount {
    double amount;
    double balance;

    BankAccount(double amount) {
        this.amount = amount;
        this.balance = amount;
    }
    void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
    }

    void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }
    }

    double getBalance(){
        return balance;
    }

}
