package _11repaso;

public class _08MixStart {
    /*
Return true if the given string begins with "mix",
except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */
    static boolean mixStart(String str){
        return (str.length() >= 3) && (str.trim().substring(1,3).equals("ix"));
    }
    public static void main(String[] args) {

        System.out.println("cadena = " + mixStart("mix snacks"));
        System.out.println("cadena = " + mixStart("pix snacks"));
        System.out.println("cadena = " + mixStart("piz snacks"));

    }
}
