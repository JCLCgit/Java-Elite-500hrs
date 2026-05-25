package _13repasoArray1;

import java.util.Arrays;

public class _20RotateLeft3 {
    /*
Given an array of ints length 3, return an array with the
elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    static int[] rotateLeft3(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[1];
        result[1] = nums[2];
        result[2] = nums[0];
        return result;
    }
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{5, 11, 9};
        int[] array3 = new int[]{7, 0, 0};

        System.out.println("[1, 2, 3] = " + Arrays.toString(rotateLeft3(array1)));
        System.out.println("[5, 11, 9] = " + Arrays.toString(rotateLeft3(array2)));
        System.out.println("[7, 0, 0] = " + Arrays.toString(rotateLeft3(array3)));
    }
}
