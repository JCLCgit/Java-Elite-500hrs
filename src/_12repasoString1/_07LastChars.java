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
        String start = "", end = "";
        if(a.length() == 0 && b.length() > 0){
            start = "@";
            return start + b.substring(b.length() - 1);
        }
        if (b.length() == 0 && a.length() > 0){
            end = "@";
            return a.substring(0, 1) + end;
        }
        if(a.equals("") && b.equals(""))
            return "@@";

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println("lastChars(\"last\", \"chars\") = " + lastChars("last", "chars"));
        System.out.println("lastChars(\"yo\", \"java\") = " + lastChars("yo", "java"));
        System.out.println("lastChars(\"hi\", \"\") = " + lastChars("hi", ""));
    }
}
