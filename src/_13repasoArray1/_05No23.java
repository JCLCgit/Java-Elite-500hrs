package _13repasoArray1;

public class _05No23 {
    /*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
     */
    static boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }
    public static void main(String[] args) {
        int[] array = {4, 5};
        int[] array1 = {4, 2};
        int[] array2 = {3, 5};
        System.out.println("no23() = " + no23(array));
        System.out.println("no23() = " + no23(array1));
        System.out.println("no23() = " + no23(array2));
    }
}
