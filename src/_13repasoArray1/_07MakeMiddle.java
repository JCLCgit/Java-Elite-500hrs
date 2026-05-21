package _13repasoArray1;

import java.util.Arrays;

public class _07MakeMiddle {
    /*
Given an array of ints of even length, return a new array length 2 containing the middle
two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
     */
    static int[] makeMiddle(int[] nums) {
        int location = nums.length / 2;
        return new int[] {nums[location - 1], nums[location]};

    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] array3 = new int[]{1, 2};

        System.out.println("Array 1: {1, 2, 3, 4} ->" + Arrays.toString(makeMiddle(array1)));
        System.out.println("Array 2: {7, 1, 2, 3, 4, 9} ->" + Arrays.toString(makeMiddle(array2)));
        System.out.println("Array 3: {1, 2} ->" + Arrays.toString(makeMiddle(array3)));
    }
}
