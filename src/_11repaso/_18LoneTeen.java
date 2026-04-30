package _11repaso;

public class _18LoneTeen {
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
     */
    static boolean loneTeen(int a, int b) {

        boolean respA, respB;
        respA = (a >= 13) && (a <= 19);
        respB = (b >= 13) && (b <= 19);

        return respA != respB;
    }
    public static void main(String[] args) {
        System.out.println("loneT = " + loneTeen(13, 99));
        System.out.println("loneTeen(21, 19) = " + loneTeen(21, 19));
        System.out.println("loneTeen(13, 13) = " + loneTeen(13, 13));
    }
}
