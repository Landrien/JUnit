package Junit1;

public class Calculator {
    static int add (int a, int b ){
        return a+b;
    }

    static int substract (int a, int b){
        return a-b;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro n'est pas autorisée");
        }
        return a / b;
    }

}


