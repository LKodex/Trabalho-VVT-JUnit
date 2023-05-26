package vvt.trabalho;

public class UpperLower {
    public static String stringToUpperByReference(String string) {
        return string.toUpperCase();
    }

    public static String stringToLowerByReference(String string) {
        return string.toLowerCase();
    }
    
    public static String stringCopyToUpper(String string) {
        String stringCopy = new String(string);
        return stringCopy.toLowerCase();
    }

    public static String stringCopyToLower(String string) {
        String stringCopy = new String(string);
        return stringCopy.toLowerCase();
    }
}
