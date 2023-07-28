package Lab_03;

import java.util.Arrays;

public class Lab03_03 {
    public static void main(String[] args) {
        int[] arrNumber = new int[] {12,34,1,16,28};
        for (int num : arrNumber){
        }

        Arrays.sort(arrNumber);
        System.out.println("The sorted array is: ");
        for (int num: arrNumber){
            System.out.println(num + "");
        }
    }
}
