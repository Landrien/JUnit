package Junit1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest{
        @Test
        public void test1() {
            Assertions.assertEquals(5,Calculator.add(2,3));
        }
    @Test
    public void test2() {
        Assertions.assertEquals(0, Calculator.add(-1,1));
    }
    @Test
    public void test3() {
        Assertions.assertEquals(-2, Calculator.substract(5,3));
    }
    @Test
    public void test4() {
        Assertions.assertEquals(-2,Calculator.substract(3,5));
    }
    @Test
    public void test5() {
        Assertions.assertEquals(0,Calculator.divide(10,0));
    }

    @ParameterizedTest
    @CsvSource({
            "8, 4, 12",
            "5, 5, 10",
            "-1, 7, 6"
    })
    void test7(int a, int b, int res) {
        Assertions.assertEquals(res,Calculator.add(a,b));
    }

    @Test
    void test8(){
        Assertions.assertEquals(5,Calculator.divide(10,2));
    }
    @Test
    void test9(){
        Assertions.assertEquals(2,Calculator.divide(7,3));
    }



}
