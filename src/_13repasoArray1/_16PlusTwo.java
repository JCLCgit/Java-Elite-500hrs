package _13repasoArray1;

import java.util.Arrays;

public class _16PlusTwo {
    /*
Given 2 int arrays, each length 2,
return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     */
    static int[] plusTwo(int[] a, int[] b) {

        return new int[]{a[0], a[1], b[0], b[1]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{3, 4};
        int[] array3 = new int[]{4, 4};
        int[] array4 = new int[]{2, 2};
        int[] array5 = new int[]{9, 2};
        int[] array6 = new int[]{3, 4};
        System.out.println("[1, 2], [3, 4] = " + Arrays.toString(plusTwo(array1, array2)));
        System.out.println("[1, 2], [3, 4] = " + Arrays.toString(plusTwo(array3, array4)));
        System.out.println("[1, 2], [3, 4] = " + Arrays.toString(plusTwo(array5, array6)));
    }
}
