package _11repaso;

public class _04MissingChar {
    /*
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the
    original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    static String missingChar(String str, int n) {
        String result = "";
        if (str.length() - 1 >= n){
            String front = str.substring(0, n);
            String back = str.substring(n+1);

            return front + back;
        }
        else return result;

    }
    public static void main(String[] args){
        String prueba = "Hola-Mundo";
        System.out.println("missingChar(\"kitten\", 1) = " + missingChar("kitten", 1));
        System.out.println("missingChar(\"kitten\", 0) = " + missingChar("kitten", 0));
        System.out.println("missingChar(\"kitten\", 4) = " + missingChar("kitten", 4));
        System.out.println("prueba = " + prueba.substring(2,2) + prueba
                .substring(4));

    }
}
