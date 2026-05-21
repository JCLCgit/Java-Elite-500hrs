package _13repasoArray1;

public class _09Unlucky1 {
    /*
    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
     */
    static boolean unlucky1(int[] nums) {
        if (nums.length == 2)
            return nums[0] == 1 && nums[1] == 3;
        if (nums.length > 2 && (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 ||
                nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3))
            return true;

        return false;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{2, 1, 3, 4, 5};
        int[] array3 = new int[]{1, 1, 1};

        System.out.println("{1, 2, 3, 4, 5} = " + unlucky1(array1));
        System.out.println("{2, 1, 3, 4, 5} = " + unlucky1(array2));
        System.out.println("{1, 1, 1} = " + unlucky1(array3));
    }
}
