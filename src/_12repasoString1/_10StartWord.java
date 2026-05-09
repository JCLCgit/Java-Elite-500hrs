package _12repasoString1;

public class _10StartWord {
    /*
    Given a string and a second "word" string, we'll say that the word matches the string
    if it appears at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
     */
    static String startWord(String str, String word){
        if(str.length() < word.length())
            return "";
        String strString = str.substring(1, word.length());
        String wordString = word.substring(1);

        if(strString.equals(wordString))
            return str.substring(0, word.length());

        return "";

    }
    /*
    static String startWord(String str, String word){
        if (str.length() < word.length()) {
            return "";
        }

        // 2. Comparamos a partir del índice 1 hasta el final de 'word'
        // Usamos substring(1) para saltarnos el primer carácter en ambos
        String strPart = str.substring(1, word.length());
        String wordPart = word.substring(1);

        if (strPart.equals(wordPart)) {
            // 3. Si coinciden, devolvemos el inicio de str con el largo de word
            return str.substring(0, word.length());
        }

        return "";
    }
    */
    public static void main(String[] args) {
        System.out.println("startWord(\"hippo\", \"hi\") = " + startWord("hippo", "hi"));
        System.out.println("startWord(\"hippo\", \"hip\") = " + startWord("hippo", "hip"));
        System.out.println("startWord(\"hippo\", \"h\") = " + startWord("hippo", "h"));
            
    }
}
