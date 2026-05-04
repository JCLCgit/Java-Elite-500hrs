package _12repasoString1;

public class _02MakeOutWord {
    /*
Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string, e.g. "<<word>>".
Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
     */
    static String makeOutWord(String out, String word) {

        return out.substring(0, 2) + word + out.substring(2);
    }
    public static void main(String[] args) {
        System.out.println("makeOutWord(\"<<>>\", \"Yay\") = " + makeOutWord("<<>>", "Yay"));
        System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") = " + makeOutWord("<<>>", "WooHoo"));
        System.out.println("makeOutWord(\"[[]]\", \"word\") = " + makeOutWord("[[]]", "word"));
    }
}
