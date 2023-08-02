package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {
        printNumber();
        List<Integer> myArray = new ArrayList<>();
        boolean isCountinue = true;
        while (isCountinue) {
            int option = getOption();

            switch (option) {
                case 1:
                    printListNumbers(myArray);
                    break;
                case 2:
                    maxValue(myArray);
                    break;
                case 3:
                    minValue(myArray);
                    break;
                case 4:
                    searchNumber(myArray);
                    break;
                case 0:
                    isCountinue = false;
                    System.out.println("See you next time!!!");
                    break;
                default:
                    System.out.println("Wrong option!");
            }

        }
    }
    public static void printNumber(){
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("Please choose your number: ");
    }

    public static int getOption(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int printListNumbers(List<Integer> myArray) {
        System.out.println(myArray);
        return 0;
    }

    public static void maxValue(List<Integer> myArray){
        int maxValue = myArray.get(0);
        for (int i = 1; i < myArray.size(); i++) {
            if (myArray.get(i) > maxValue)
                maxValue = myArray.get(i);
        }
    }

    public static void minValue(List<Integer> myArray) {
        int minValue = myArray.get(0);
        for (int i = 1; i < myArray.size(); i++) {
            if (myArray.get(i) < minValue)
                minValue = myArray.get(i);
        }
    }

    public static void searchNumber(List<Integer> myArray){
        System.out.println("Please input your number: ");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();
        if (myArray.contains(searchNumber))
            System.out.println(myArray.indexOf(searchNumber));
        else System.out.println("Number is invalid!!!");
    }
}
