package _13repasoArray1;

import java.util.Arrays;

public class _10SameFirstLast {
    /*
Given an array of ints, return true if the array is length 1 or more,
and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3, 1};
        int[] array3 = new int[]{1, 2, 1};

        System.out.println("{1, 2, 3} = " + sameFirstLast(array1));
        System.out.println("{1, 2, 3, 1} = " + sameFirstLast(array2));
        System.out.println("{1, 2, 1} = " + sameFirstLast(array3));

    }
}
