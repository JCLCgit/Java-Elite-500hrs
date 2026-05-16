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
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i < 2 && str.charAt(i) == 'x')
                continue;

            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("withoutX2(\"xHi\") = " + withoutX2("xHi"));
        System.out.println("withoutX2(\"Hxi\") = " + withoutX2("Hxi"));
        System.out.println("withoutX2(\"Hi\") = " + withoutX2("Hi"));
    }
}
