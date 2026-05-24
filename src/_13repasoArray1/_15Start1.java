package _13repasoArray1;

import java.util.Arrays;

public class _15Start1 {
    /*
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
     */
    static int start1(int[] a, int[] b) {

        if((a.length > 0 && a[0] == 1) && (b.length > 0 && b[0] == 1))
            return 2;
        if((a.length > 0 && a[0] == 1) || (b.length > 0 && b[0] == 1))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 3};
        int[] array3 = new int[]{7, 2, 3};
        int[] array4 = new int[]{1};
        int[] array5 = new int[]{1, 2};
        int[] array6 = new int[]{};
        System.out.println("[1, 2, 3], [1, 3] = " + (start1(array1, array2)));
        System.out.println("[7, 2, 3], [1] = " + (start1(array3, array4)));
        System.out.println("[1, 2], [] = " + (start1(array5, array6)));
    }
}
