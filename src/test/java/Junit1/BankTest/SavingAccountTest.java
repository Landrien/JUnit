package Junit1.BankTest;


import Junit1.Bank.SavingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test pour la classe SavingAccount
 */

public class SavingAccountTest {
    SavingAccount account1;

    /**
     * Pour chaque Test le compte a 200
     */

    @BeforeEach
    void Intialiser() {
        account1 = new SavingAccount(200);
    }
    /**
     * Test pour la fonction addInterrest() ajoute bien les interets
     */

    @Test
    void addingInterest() {
        Assertions.assertEquals(202, SavingAccount.addInterest());
    }
}
