package _13repasoArray1;

import java.util.Arrays;

public class _21Sum2 {
    /*
    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
     */
    static int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0)
            return 0;

        for (int i = 0; i < 2 && i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 1};
        int[] array3 = new int[]{1, 1, 1, 1};

        System.out.println("{1, 2, 3} = " + sum2(array1));
        System.out.println("{1, 1} = " + sum2(array2));
        System.out.println("{1, 1, 1, 1} = " + sum2(array3));
    }
}
