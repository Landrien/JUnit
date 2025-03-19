package Junit1;

public class DatabaseConnection {

    private static boolean base = false;

    static boolean connect (){
        return base = !base;
    }

    boolean getbase(){
        return base;
    }

    public static void setBase(boolean base) {
        DatabaseConnection.base = base;
    }
}
