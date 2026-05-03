package _11repaso;

public class _28DelDel {
    /*
Given a string, if the string "del" appears starting at index 1, return a
string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    static String delDel(String str) {
        if (str.length() >= 3 && str.substring(1, 4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
        else
        return str;
    }
    public static void main(String[] args) {
        System.out.println("delDel(\"adelbc\") = " + delDel("adelbc"));
        System.out.println("delDel(\"adelHello\") = " + delDel("adelHello"));
        System.out.println("delDel(\"adedbc\") = " + delDel("adedbc"));
    }
}
