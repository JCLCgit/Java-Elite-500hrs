package _14repasoLogic1;

public class _18LessBy10 {
    /*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
     */
    static boolean lessBy10(int a, int b, int c) {
        int mayor = 0 , menor = 0;
        
        if (a >= b && a >= c){
            mayor = a;
        } else if (b >= c){
            mayor = b;
        } else {
            mayor = c;
        }

        if (a <= b && a <= c){
            menor = a;
        } else if (b <= c){
            menor = b;
        }else {
            menor = c;
        }
        /*
        System.out.println("mayor = " + mayor);
        System.out.println("menor = " + menor);
        System.out.println("Math.abs(mayor - menor) = " + Math.abs(mayor - menor));
         */
        return Math.abs(mayor - menor) >= 10;

    }
    public static void main(String[] args) {
        System.out.println("lessBy10(1, 7, 11) = " + lessBy10(1, 7, 11));
        System.out.println("lessBy10(1, 7, 10) = " + lessBy10(1, 7, 10));
        System.out.println("lessBy10(11, 1, 7) = " + lessBy10(11, 1, 7));
    }
}
