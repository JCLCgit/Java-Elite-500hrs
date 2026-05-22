package _13repasoArray1;

import java.util.Arrays;

public class _13MakeEnds {
    /*
Given an array of ints, return a new array length 2 containing the first
and last elements from the original array.
The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
     */
    static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = new int[]{7, 4, 6, 2};
        System.out.println("{1, 2, 3} = " + Arrays.toString(makeEnds(array1)));
        System.out.println("{1, 2, 3, 4} = " + Arrays.toString(makeEnds(array2)));
        System.out.println("{7, 4, 6, 2} = " + Arrays.toString(makeEnds(array3)));
    }
}
