package _11repaso;

public class _31EndUp {
    /*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
     */
    static String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        else{
            String result = "";
            result = str.substring(0, str.length() - 3);
            return result + str.substring(str.length() - 3).toUpperCase();
        }
    }
    public static void main(String[] args) {
        System.out.println("endUp(\"Hello\") = " + endUp("Hello"));
        System.out.println("endUp(\"hi there\") = " + endUp("hi there"));
        System.out.println("endUp(\"hi\") = " + endUp("hi"));
    }
}
