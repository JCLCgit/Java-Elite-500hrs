package _13repasoArray1;

import java.util.Arrays;

public class _04MiddleWay {
    /*
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 5, 6};
        int[] array3 = new int[]{7, 7, 7};
        int[] array4 = new int[]{3, 8, 0};
        int[] array5 = new int[]{5, 2, 9};
        int[] array6 = new int[]{1, 4, 5};


        System.out.println(Arrays.toString(middleWay(array1, array2)));
        System.out.println(Arrays.toString(middleWay(array3, array4)));
        System.out.println(Arrays.toString(middleWay(array5, array6)));
    }
}
