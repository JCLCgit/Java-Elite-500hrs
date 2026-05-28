package _13repasoArray1;

import java.util.Arrays;

public class _24BiggerTwo {
    /*
Start with 2 int arrays, a and b, each length 2.
Consider the sum of the values in each array.
Return the array which has the largest sum.
In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
     */
    static int[] biggerTwo(int[] a, int[] b) {
        if (Arrays.stream(a).sum() >= Arrays.stream(b).sum())
            return a;
        else
            return b;

    }
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{3, 4};
        int[] array3 = new int[]{1, 1};


        System.out.println("[1, 2] ,[3, 4] = " + Arrays.toString(biggerTwo( array1, array2)));
        System.out.println("[3, 4] ,[1, 2] = " + Arrays.toString(biggerTwo( array2, array1)));
        System.out.println("[1, 1] ,[1, ] = " + Arrays.toString(biggerTwo( array3, array1)));
    }
}
