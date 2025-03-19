package Junit1;

import org.junit.jupiter.api.*;

public class DataBaseConnectionTest {

    @BeforeAll
    static void connection(){
        DatabaseConnection.setBase(true);
    }


    @Test
    void Test1(){
        Assertions.assertEquals(true, DatabaseConnection.connect());
    }

    @Test
    void Test(){
        Assertions.assertEquals(false, DatabaseConnection.connect());
    }

    @AfterAll
    static void deconnected(){
        DatabaseConnection.setBase(false);
    }


}
