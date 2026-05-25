package _13repasoArray1;

public class _22Has23 {
    /*
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
     */
    static boolean has23(int[] nums) {

        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 5};
        int[] array2 = new int[]{4, 3};
        int[] array3 = new int[]{4, 5};
        System.out.println("{2, 5} = " + has23(array1));
        System.out.println("{4, 3} = " + has23(array2));
        System.out.println("{4, 5} = " + has23(array3));
    }
}
