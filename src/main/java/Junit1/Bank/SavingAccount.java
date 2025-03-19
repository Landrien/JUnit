package Junit1.Bank;

public class SavingAccount extends BankAccount {
    SavingAccount(double amount) {
        super(amount);
    }

    void addInterest(){
        this.balance += this.balance * 0.01;
    }
}
