package Junit1.Bank;

/**
 * Hérite de BankAccount et
 * ajoute une méthode addInterest() pour augmenter
 * le solde en fonction d'un taux d'intérêt.
 *
 * @author Hadrien Landemarre
 */
public class SavingAccount extends BankAccount {
    /**
     * Constructeur de la classe
     * @param amount
     */
    public SavingAccount(double amount) {
        super(amount);
    }

    /**
     *
     * @return la valeur du compte après avoir eu des interets
     */

    public static double addInterest(){
        return balance += balance * 0.01;
    }
}
