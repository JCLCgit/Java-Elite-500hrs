package _13repasoArray1;

import java.util.Arrays;

public class _18Make2 {
    /*
Given 2 int arrays, a and b, return a new array length 2 containing,
as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements
available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
     */
    /*
    static int[] make2(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int[] resulFinal = new int[2];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        for (int i = 0; i < 2; i++) {
            resulFinal[i] = result[i];
        }
        return resulFinal;
    }
     */
    static int[] make2(int[] a, int[] b) {
        int[] resultFinal = new int[2];
        int index = 0;
        for (int i = 0; i < a.length && index < 2; i++) {
            resultFinal[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length && index < 2; i++) {
            resultFinal[index] = b[i];
            index++;
        }

        return resultFinal;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 5};
        int[] array2 = new int[]{1, 2 ,3};
        int[] array3 = new int[]{4};
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{};
        int[] array6 = new int[]{1, 2};

        System.out.println("[4, 5], [1, 2, 3] = " + Arrays.toString(make2(array1, array2)));
        System.out.println("[4], [1, 2, 3] = " + Arrays.toString(make2(array3, array4)));
        System.out.println("[], [1, 2] = " + Arrays.toString(make2(array5, array6)));
    }
}
