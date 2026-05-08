package _12repasoString1;

public class _07LastChars {
    /*
Given 2 strings, a and b, return a new string made of the first
char of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
     */
    static String lastChars(String a, String b) {
        String start, last = b;
        if(a.length() == 0)
            start = "@";
        else
            start = a;
        if (b.length() == 0)
            last = "@";
        else
            last = b;
        return
    }
    public static void main(String[] args) {
        System.out.println("lastChars(\"last\", \"chars\") = " + lastChars("last", "chars"));
        System.out.println("lastChars(\"yo\", \"java\") = " + lastChars("yo", "java"));
        System.out.println("lastChars(\"hi\", \"\") = " + lastChars("hi", ""));
    }
}
