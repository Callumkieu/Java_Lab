package Lab_03;

public class Lab03_1 {
    public static void main(String[] args) {
        int[] intArr = new int []{1, 2, 3, 4, 5};

        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0){
                evenNumber++;
            }
            else {
                oddNumber++;
            }
        }

        System.out.println("Even number: " + evenNumber);
        System.out.println("Odd number: " + oddNumber);
    }

}
