package _12repasoString1;

public class _29LastTwo {
    /*
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
     */
    static String lastTwo(String str){
        int length = str.length();
        if(str.length() >= 2)
            return str.substring(0, str.length() - 2) + str.charAt(length - 1) + str.charAt(length -2);
        return str;
    }
    public static void main(String[] args) {
        System.out.println("lastTwo(\"coding\") = " + lastTwo("coding"));
        System.out.println("lastTwo(\"cat\") = " + lastTwo("cat"));
        System.out.println("lastTwo(\"ab\") = " + lastTwo("ab"));
    }
}
