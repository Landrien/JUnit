package Junit1.Bank;

/**
 * Hérite de BankAccount et ajoute une méthode deductFees()
 * pour réduire le solde en fonction de frais fixes.
 * @author Hadrien Landemarre
 */

public class CheckingAccount extends BankAccount {

    /**
     * Constructeur de la classe
     * @param amount
     */
    public CheckingAccount(double amount) {
        super(amount);
    }


    /**
     *
     * @return la valeur du compte après une déduction d'impot
     */

    public static double deductFees(){
        int Fees = 10;
        return balance -= Fees;
    }
}
