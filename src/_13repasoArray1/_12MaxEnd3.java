package _13repasoArray1;

import java.util.Arrays;

public class _12MaxEnd3 {
    /*

Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value.
Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    static int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[2]){
            return new int[]{nums[0], nums[0], nums[0]};
        }
        return new int[]{nums[2], nums[2], nums[2]};
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{11, 5, 9};
        int[] array3 = new int[]{2, 11, 3};
        System.out.println("{1, 2, 3} = " + Arrays.toString(maxEnd3(array1)));
        System.out.println("{11, 5, 9} = " + Arrays.toString(maxEnd3(array2)));
        System.out.println("{2, 11, 3} = " + Arrays.toString(maxEnd3(array3)));
        
    }
}
