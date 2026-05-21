package _13repasoArray1;

import java.util.Arrays;

public class _08MidThree {
    /*
Given an array of ints of odd length, return a new array length 3
containing the elements from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
     */
    static int[] midThree(int[] nums) {
        int position = nums.length / 2;
        return new int[]{nums[position - 1], nums[position], nums[position + 1]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] array3 = new int[]{1, 2, 3};

        System.out.println("{1, 2, 3, 4, 5} = " + Arrays.toString(midThree(array1)));
        System.out.println("{8, 6, 7, 5, 3, 0, 9} = " + Arrays.toString(midThree(array2)));
        System.out.println("{1, 2, 3} = " + Arrays.toString(midThree(array3)));

    }
}
