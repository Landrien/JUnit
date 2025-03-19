package Junit1.Bank;

public class CheckingAccount extends BankAccount {
    CheckingAccount(double amount) {
        super(amount);
    }

    void deductFees(){
        int Fees = 10;
        this.balance -= Fees;
    }
}
