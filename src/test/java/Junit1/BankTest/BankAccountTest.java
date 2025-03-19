package Junit1.BankTest;

import Junit1.Bank.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Junit1.Bank.BankAccount.deposit;

/**
 * Test pour la classe BankAccount
 */

public class BankAccountTest {
    BankAccount account1;

    /**
     * Initialise le compte à 200 pour chaque test
     */
    @BeforeEach
    void Intialiser() {
        account1 = new BankAccount(200);
    }

    /**
     * Test pour la fonction depot() ajoute bien la somme mis en paramètre
     */

    @Test
    void TestDeposit(){
        Assertions.assertEquals(250, BankAccount.deposit(50));

    }
    /**
     * Test pour la fonction withdraw) enlève  la somme mis en paramètre
     */

    @Test
    void TestWithdraw() {
        Assertions.assertEquals(150, BankAccount.withdraw(50));
    }
    /**
     * Test pour la fonction getBalance() renvoie bien la somme mis en paramètre
     */

    @Test
    void TestgetBalance() {
        Assertions.assertEquals(200, BankAccount.getBalance());
    }





}
