package Junit1;

public class Counter {
    static int i = 0;
    public static int increment(){
        return i++;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Counter.i = i;
    }
}
