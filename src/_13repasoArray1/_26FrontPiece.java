package _13repasoArray1;

import java.util.Arrays;

public class _26FrontPiece {
    /*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
     */
    static int[] frontPiece(int[] nums) {
        if (nums.length <= 2)
            return nums;
        else
            return new int[]{nums[0], nums[1]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{1};
        System.out.println("[1, 2, 3] = " + Arrays.toString(frontPiece(array1)));
        System.out.println("[1, 2] = " + Arrays.toString(frontPiece(array2)));
        System.out.println("[1] = " + Arrays.toString(frontPiece(array3)));
    }
}
