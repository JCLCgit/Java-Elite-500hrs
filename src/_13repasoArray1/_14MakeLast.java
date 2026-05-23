package _13repasoArray1;

import java.util.Arrays;

public class _14MakeLast {
    /*
Given an int array, return a new array with double the length where
its last element is the same as the original array, and all the other elements are 0.
The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
     */
    static int[] makeLast(int[] nums) {
        int theLength = nums.length;
        int[] result = new int[theLength*2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 5, 6};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{3};
        System.out.println("{4, 5, 6} = " + Arrays.toString(makeLast(array1)));
        System.out.println("{1, 2} = " + Arrays.toString(makeLast(array2)));
        System.out.println("{3} = " + Arrays.toString(makeLast(array3)));
    }
}
