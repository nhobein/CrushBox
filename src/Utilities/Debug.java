package Utilities;

public class Debug {
    private static Boolean DEBUGENABLED = true;
    
    public static void debug(String message) {
        if (DEBUGENABLED) {
            System.out.println(message);
        }
    }
   public static void debug(int value) {
            if (DEBUGENABLED) {
                System.out.println(value);
            }
    }
}
