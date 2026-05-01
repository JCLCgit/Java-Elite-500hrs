package _11repaso;

public class _19StartOz {
    /*

Given a string, return a string made of the first 2 chars (if present), however
include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */
    static String startOz(String str) {

        String result = "";
        char start;
        char end;

        if (str.length() < 2)
            return "";
        else if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            result = str.substring(0,2);

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("startOz(\"ozymandias\") = " + startOz("ozymandias"));
        System.out.println("startOz(\"bzoo\") = " + startOz("bzoo"));
        System.out.println("startOz(\"oxx\") = " + startOz("oxx"));
    }
}
