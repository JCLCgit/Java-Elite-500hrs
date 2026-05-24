package _13repasoArray1;

import java.util.Arrays;

public class _18Make2 {
    /*
Given 2 int arrays, a and b, return a new array length 2 containing,
as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements
available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
     */
    static int[] make2(int[] a, int[] b) {

    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 5 ,3};
        int[] array3 = new int[]{5, 2, 3};
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{1, 5 ,3};
        int[] array6 = new int[]{5, 2, 3};

        System.out.println("[4, 5], [1, 2, 3] = " + Arrays.toString(make2(array1, array2)));
        System.out.println("[4, 5], [1, 2, 3] = " + Arrays.toString(make2(array1, array2)));
        System.out.println("[4, 5], [1, 2, 3] = " + Arrays.toString(make2(array1, array2)));
    }
}
