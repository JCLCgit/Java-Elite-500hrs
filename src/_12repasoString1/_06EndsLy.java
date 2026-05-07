package _12repasoString1;

public class _06EndsLy {
    /*
    Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
     */
    static boolean endsLy(String str) {
        if(str.length() < 2)
            return false;
        else
            return (str.substring(str.length() - 2).equals("ly"));
    }
    public static void main(String[] args) {
        System.out.println("endsLy(\"oodly\") = " + endsLy("oodly"));
        System.out.println("endsLy(\"y\") = " + endsLy("y"));
        System.out.println("endsLy(\"oddy\") = " + endsLy("oddy"));
    }
}
