package _13repasoArray1;

import java.util.Arrays;

public class _06Fix23 {
    /*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
     */
    static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i != nums.length - 1) && nums[i] == 2 && nums[i + 1] == 3){
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{2, 3, 5};
        int[] array3 = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(fix23(array1)));
        System.out.println(Arrays.toString(fix23(array2)));
        System.out.println(Arrays.toString(fix23(array3)));
    }
}
