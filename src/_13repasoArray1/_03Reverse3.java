package _13repasoArray1;

public class _03Reverse3 {
    /*
Given an array of ints length 3, return a new array with
the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */
    static int[] reverse3(int[] nums) {
        int result[] = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[j] = nums[i];
            j++;
        }
        return result;
    }
    static void printing(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }
    }
    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 3};
        int array2[] = new int[]{5, 11, 9};
        int array3[] = new int[]{7, 0, 0};
        printing(reverse3(array1));
        printing(reverse3(array2));
        printing(reverse3(array3));
    }
}
