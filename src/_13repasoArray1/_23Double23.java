package _13repasoArray1;

public class _23Double23 {
    /*
Given an int array, return true if the array contains 2 twice, or 3 twice.
The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
     */
    static boolean double23(int[] nums) {
        if(nums.length < 2)
            return false;
        if (nums[0] == 2 && nums[1] == 2)
            return true;
        if (nums[0] == 3 && nums[1] == 3)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 2};
        int[] array2 = new int[]{3, 3};
        int[] array3 = new int[]{2, 3};

        System.out.println("array1 = " + double23(array1));
        System.out.println("array2 = " + double23(array2));
        System.out.println("array3 = " + double23(array3));
    }
}
