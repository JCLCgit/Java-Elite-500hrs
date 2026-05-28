package _13repasoArray1;

import java.util.Arrays;

public class _27Front11 {
    /*
Given 2 int arrays, a and b, of any length,
return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
     */
    static int[] front11(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0)
            return a;
        if (a.length > 0 && !(b.length > 0))
            return new int[]{a[0]};
        if (b.length > 0 && !(a.length > 0))
            return new int[]{b[0]};

        return new int[]{a[0], b[0]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{7, 9, 8};
        int[] array3 = new int[]{1};
        int[] array4 = new int[]{2};
        int[] array5 = new int[]{1, 7};
        int[] array6 = new int[]{};

        System.out.println("{1, 2, 3}, {7, 9, 8} = " + Arrays.toString(front11(array1, array2)));
        System.out.println("{1}, {2} = " + Arrays.toString(front11(array3, array4)));
        System.out.println("{1, 7}, {} = " + Arrays.toString(front11(array5, array6)));
    }
}
