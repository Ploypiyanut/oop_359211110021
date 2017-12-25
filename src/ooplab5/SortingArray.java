package ooplab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//1.allow user input data into array : inputData,showData
//2.find summation of data in array
//3.find average value in array
//4.find maximum value in array
//5.find minimun value in array
//6.sorting data in array (Descending order)
//7.sorting data in array (Ascending order)
//
public class SortingArray {
    private static int MAX = 5;

    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        inputData(num)
        showData(num);
        findsummation(num);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AssertionError(num);
    }//main

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);

    //DescendingOrder




    private static void AssertionError(Integer[] num) {
        System.out.println("Ascending Order :");
        Arrays.sort(num,collections.reverseOrder);
    }


    private static void findMax(Integer[] num) {
        System.out.println("The Maximum value is :" +
                collectoins.max(Array.asList(num)));
    }//findMax

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleass enter an integer:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "]:");
            num[i] = scanner.nextInt();
        }

    }

    private static void findsummation(Integer[] num) {
        int total = 0;
        for (int val:num
        total += val;
        System.out.println("The summtaion is :"+total);
        finfAverage(total);
    }//findsummation

    private static void finfAverage(Integer num) {
        System.out.println("The average value is :"+num/MAX);
    }//findAverage

    private static void showData(Integer[] num) {
        System.out.println("Data in array");
        //enhance loop
        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}//main


