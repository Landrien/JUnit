package Junit1;

import org.junit.jupiter.api.*;

public class CounterTest {

    @BeforeEach
    void resetCompteur(){
        Counter.setI(0);
    }

    @Test
    void testIncrement() {
        Assertions.assertEquals(0, Counter.increment());
    }
    @Test
    void testIncrement1() {
        Assertions.assertEquals(1, Counter.increment());
    }
    @Test
    void testIncrement2() {
        Assertions.assertEquals(2, Counter.increment());
    }

    @AfterEach
    void affiche(){
        System.out.println("message");
    }
}
