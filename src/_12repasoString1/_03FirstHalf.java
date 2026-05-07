package _12repasoString1;

public class _03FirstHalf {
    /*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
     */
    static String firstHalf(String str) {
        if (str.length() % 2 == 0)
            return str.substring(0, (str.length()/2));
        else
            return str;
    }
    public static void main(String[] args){
        System.out.println("firstHalf(\"WooHoo\") = " + firstHalf("WooHoo"));
        System.out.println("firstHalf(\"HelloThere\") = " + firstHalf("HelloThere"));
        System.out.println("firstHalf(\"abcdef\") = " + firstHalf("abcdef"));
    }
}
