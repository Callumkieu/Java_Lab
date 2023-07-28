package Lab_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab03_04 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 12, 16, 28, 34};
        int[] arr2 = new int[]{1, 13, 16, 27, 99};

        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int pos = 0;

        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
    }
}
