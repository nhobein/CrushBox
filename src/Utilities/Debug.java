package Utilities;

public class Debug {
    private static Boolean DEBUGENABLED = true;
    
    public static void debug(String message) {
        if (DEBUGENABLED) {
            System.out.println(message);
        }
    }
}
