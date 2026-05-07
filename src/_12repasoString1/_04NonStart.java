package _12repasoString1;

public class _04NonStart {
    /*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
     */
    static String nonStart(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1)
            return a.substring(1) + b.substring(1);
        else
            return a + b;
    }
    public static void main(String[] args){
        System.out.println("nonStart(\"Hello\", \"There\") = " + nonStart("Hello", "There"));
        System.out.println("nonStart(\"java\", \"code\") = " + nonStart("java", "code"));
        System.out.println("nonStart(\"shotl\", \"java\") = " + nonStart("shotl", "java"));
    }
}
