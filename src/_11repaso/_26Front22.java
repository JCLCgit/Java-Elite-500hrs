package _11repaso;

public class _26Front22 {
    /*
    Given a string, take the first 2 chars and return
    the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
    If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
     */
    static String front22(String str) {
        String result;
        if (str.length() >= 2){
            result = str.substring(0, 2) + str + str.substring(0, 2);
            return result;
        } else
            return str + str + str;
    }
    public static void main(String[] args) {
        System.out.println("front22(\"kitten\") = " + front22("kitten"));
        System.out.println("front22(\"HaHaHa\") = " + front22("Ha"));
        System.out.println("front22(\"abc\") = " + front22("abc"));
    }
}
