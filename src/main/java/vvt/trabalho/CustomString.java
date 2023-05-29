package vvt.trabalho;

public class CustomString {
    private char[] string;

    public CustomString(String string) {
        this.string = string.toCharArray();
    }

    public CustomString(CustomString string) {
        this.string = string.getAsCharArray();
    }

    public CustomString toLower() {
        for (int i = 0; i < string.length; i++)
        string[i] = Character.toLowerCase(string[i]);
        return this;
    }

    public CustomString toUpper() {
        for (int i = 0; i < string.length; i++)
        string[i] = Character.toUpperCase(string[i]);
        return this;
    }
    
    public CustomString copyAndUpper() {
        CustomString copy = new CustomString(this);
        return copy.toUpper();
    }

    public CustomString copyAndLower() {
        CustomString copy = new CustomString(this);
        return copy.toLower();
    }

    public String getAsString() {
        return new String(string);
    }

    public char[] getAsCharArray() {
        return string.clone();
    }
}
