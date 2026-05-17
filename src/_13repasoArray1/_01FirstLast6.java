package _13repasoArray1;

public class _01FirstLast6 {
    /*
Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
     */
    static boolean firstLast6(int[] nums) {
        if(nums.length == 1 && nums[0] == 6)
            return true;
        if(nums.length > 1 && (nums[0] == 6 || (nums[nums.length - 1]) == 6))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 6};
        int array2[] = new int[]{6, 1, 2, 3};
        int array3[] = new int[]{13, 6, 1, 2, 3};
        System.out.println("firstLast6([1,2, 6]) = " + firstLast6(array1));
        System.out.println("firstLast6(array2) = " + firstLast6(array2));
        System.out.println("firstLast6(array3) = " + firstLast6(array3));
    }
}
