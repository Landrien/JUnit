package Junit1.BankTest;

import Junit1.Bank.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test pour la classe CheckingAccount
 */

public class CheckingAccountTest {
    CheckingAccount account1;

    /**
     * Pour chaque Test le compte a 200
     */

    @BeforeEach
    void Intialiser() {
        account1 = new CheckingAccount(200);
    }

    /**
     * Test pour la fonction deductfee() deduit bien la somme des impots
     */

    @Test
    void deductFees(){
        Assertions.assertEquals(190, CheckingAccount.deductFees());
    }
}
