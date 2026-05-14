package _12repasoString1;

public class _25Right2 {
    /*
Given a string, return a "rotated right 2" version where the last 2 chars
are moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
     */
    static String right2(String str) {
        if(str.length() > 2)
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        return str;
    }
    public static void main(String[] args) {
        System.out.println("right2(\"Hello\") = " + right2("Hello"));
        System.out.println("right2(\"java\") = " + right2("java"));
        System.out.println("right2(\"Hi\") = " + right2("Hi"));
    }
}
