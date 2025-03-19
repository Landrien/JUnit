package TP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SommeArgentTest {
    SommeArgent m12CHF;
    SommeArgent m14CHF;
    SommeArgent expected;
    @BeforeEach
     void Initialisation(){
        m12CHF = new SommeArgent(12, "CHF");
        m14CHF = new SommeArgent(14, "CHF");
        expected = new SommeArgent(26, "CHF");



    }
    @Test
    void Testadd() {
        SommeArgent result = this.m12CHF.add(m14CHF);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void Testadd2() throws Exception {
        SommeArgent result = m12CHF.add2(m14CHF);
        Assertions.assertEquals(expected, result);
    }
}
