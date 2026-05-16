package _12repasoString1;

public class _32WithoutX2 {
    /*
Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */
    static String withoutX2(String str) {
        if(str.charAt(0) == 'x' && str.charAt(1) == 'x' && str.length() > 2)
            return str.substring(2);
        if(str.charAt(0) == 'x' && str.charAt(1) == 'x')
            return "";
        if(str.charAt(0) == 'x' && !(str.charAt(1) == 'x'))
            return str.substring(1);
        if(!(str.charAt(0) == 'x') && (str.charAt(1) == 'x'))
            return str.charAt(0) + str.substring(2);
        else
            return str;

    }
    public static void main(String[] args) {
        System.out.println("withoutX2(\"xHi\") = " + withoutX2("xHi"));
        System.out.println("withoutX2(\"Hxi\") = " + withoutX2("Hxi"));
        System.out.println("withoutX2(\"Hi\") = " + withoutX2("Hi"));
    }
}
