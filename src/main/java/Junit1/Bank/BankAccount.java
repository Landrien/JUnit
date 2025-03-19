package Junit1.Bank;

/**
 * Classe de base qui gère le solde et permet les opérations de dépôt et de retrait.
 *
 * @author Hadrien Landemarre
 */


public class BankAccount {
   static double balance;

    /**
     *
     * @param balance
     */
    /**
     *
     * Le constucteur de la classe
     * */

    public BankAccount(double balance) throws IllegalArgumentException {
        BankAccount.balance = balance;
    }

    /**
     * @Exeception si un retrait dépasse le solde disponible.
     * @param amount
     * @return
     */

    public static double deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    /**
     *
     * @param amount
     * @return la valeur du compte quand on retire de l'argent
     */

    public static double withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    /**
     *
     * @return la valeur du compte
     */

    public static double getBalance(){
        return balance;
    }

}
