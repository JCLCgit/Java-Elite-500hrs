package _13repasoArray1;

import java.util.Arrays;

public class _25SwapEnds {
    /*
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     */
    static int[] swapEnds(int[] nums) {
        if (nums.length <= 1)
            return nums;
        else {
            nums[0] += nums[nums.length - 1];
            nums[nums.length - 1] = nums[0] - nums[nums.length - 1];
            nums[0] -= nums[nums.length - 1];
            return nums;
        }
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = new int[]{8, 6, 7, 9, 5};

        System.out.println("[1, 2, 3, 4] = " + Arrays.toString(swapEnds(array1)));
        System.out.println("[1, 2, 3] = " + Arrays.toString(swapEnds(array2)));
        System.out.println("[8, 6, 7, 9, 5] = " + Arrays.toString(swapEnds(array3)));

    }
}
