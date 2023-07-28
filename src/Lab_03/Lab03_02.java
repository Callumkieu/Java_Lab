package Lab_03;

public class Lab03_02 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};

        int max = intArr[0];
        int min = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min){
                min = intArr[i];
            }
            else if (intArr[i] > max){
                max = intArr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

    }
}
