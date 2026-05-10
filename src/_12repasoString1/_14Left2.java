package _12repasoString1;

public class _14Left2 {
    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
     */
    /*
    static String left2(String str) {
        String front, back;
        front = str.substring(0, 2);
        if (str.length() > 2){
            back = str.substring(2);
            return back + front;
        }
        return front;
    }
    */
    static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);

        // Solution notes: conveniently, substring(2) extracts the string from index 2
        // through the end. So we put that first, followed by substring(0, 2)
    }


    public static void main(String[] args) {
        System.out.println("left2(\"Hello\") = " + left2("Hello"));
        System.out.println("left2(\"java\") = " + left2("java"));
        System.out.println("left2(\"Hi\") = " + left2("Hi"));
    }
}
