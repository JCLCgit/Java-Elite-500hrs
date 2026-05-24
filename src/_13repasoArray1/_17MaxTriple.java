package _13repasoArray1;

import java.util.Arrays;

public class _17MaxTriple {
    /*
Given an array of ints of odd length, look at the first, last,
and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
     */
    static int maxTriple(int[] nums) {
        int first = Math.max(nums[0], nums[nums.length / 2]);
        return Math.max(first,nums[nums.length - 1]);
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 5 ,3};
        int[] array3 = new int[]{5, 2, 3};
        System.out.println("[1, 2, 3] = " + maxTriple(array1));
        System.out.println("[1, 5, 3] = " + maxTriple(array2));
        System.out.println("[5, 2, 3] = " + maxTriple(array3));
    }
}
