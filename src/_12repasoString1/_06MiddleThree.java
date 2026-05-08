package _12repasoString1;

public class _06MiddleThree {
    /*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
The string length will be at least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
     */
    static String middleThree(String str) {
        int start = 0;
        start = (str.length() - 3) / 2;
        if (str.length() > 3)
            return str.substring(start, str.length() - start);
        else
            return str;
    }
    public static void main(String[] args) {
        System.out.println("middleThree(\"Candy\") = " + middleThree("Candy"));
        System.out.println("middleThree(\"and\") = " + middleThree("and"));
        System.out.println("middleThree(\"solving\") = " + middleThree("solving"));
    }
}
