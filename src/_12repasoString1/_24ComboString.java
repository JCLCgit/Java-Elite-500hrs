package _12repasoString1;

public class _24ComboString {
    /*
Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
     */
    static String comboString(String a, String b) {
        if(!a.isEmpty() && !b.isEmpty()){
            if (a.length() > b.length())
                return b + a + b;
            else  
                return a + b + a;
            
        } else if (!a.isEmpty() && b.isEmpty()) {
            return a;
        }else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("comboString(\"Hello\", \"hi\") = " + comboString("Hello", "hi"));
        System.out.println("comboString(\"hi\", \"Hello\") = " + comboString("hi", "Hello"));
        System.out.println("comboString(\"aaa\", \"b\") = " + comboString("aaa", "b"));
    }
}
