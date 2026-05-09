package _12repasoString1;

public class _08SeeColor {
    /*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue
     */
    static String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).contentEquals("red"))
            return "red";

        if (str.length() >= 4 && str.substring(0, 4).contentEquals("blue")) {
            return "blue";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println("seeColor(\"redxx\") = " + seeColor("redxx"));
        System.out.println("seeColor(\"xxred\") = " + seeColor("xxred"));
        System.out.println("seeColor(\"blueTimes\") = " + seeColor("blueTimes"));
    }
}
