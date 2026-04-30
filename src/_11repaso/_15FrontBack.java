package _11repaso;

public class _15FrontBack {
    /*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
     */
    static String frontBack(String str) {

        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static void main(String[] args) {

        System.out.println("frontBack = " + frontBack("code"));
        System.out.println("frontBack = " + frontBack("a"));
        System.out.println("frontBack = " + frontBack("ab"));
    }
}

