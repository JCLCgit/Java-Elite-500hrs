package _12repasoString1;

public class _20Without2 {
    /*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "".
Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
     */
    static String without2(String str) {
        if (str.length() < 2)
            return str;
        if(str.length() == 2)
            return "";
        if(str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        }else
            return str;


    }
    public static void main(String[] args) {
        System.out.println("without2(\"HelloHe\") = " + without2("HelloHe"));
        System.out.println("without2(\"HelloHi\") = " + without2("HelloHi"));
        System.out.println("without2(\"Hi\") = " + without2("Hi"));
    }
}
