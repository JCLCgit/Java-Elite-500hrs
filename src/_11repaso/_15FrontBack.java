package _11repaso;

public class _15FrontBack {
    /*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
     */
    static String frontBack(String str) {

        if (str.length() <= 1)
            return str;
        String result;
        result = str.substring(1,str.length() - 1);

        return str.charAt(str.length()-1) + result + str.charAt(0);
    }
    
    public static void main(String[] args) {

        System.out.println("frontBack = " + frontBack("code"));
        System.out.println("frontBack = " + frontBack("a"));
        System.out.println("frontBack = " + frontBack("ab"));
    }
}

