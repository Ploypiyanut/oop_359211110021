package ooplab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//1. allow user input data into array: inputData,ShowData
//2. find summation of data in array
//3. find average value in array
//4. find maximum value in array
//5. find minimum value in array
//6. sorting data in array (Descending order)
//7. sorting data in array (Ascending order)
public class SortingArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        Integer []num = new  Integer[MAX];
        num = inputData(num);
        showData(num);
        findSummation(num);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);

    }//main

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascending Order: ");
        Arrays.sort(num,Collections.reverseOrder());
        showData(num);
    }//AscendingOrder

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order: ");
        showData(num); //showData(Array.sort(num));
    }//DescendingOrder

    private static void findMin(Integer[] num) {
        System.out.println("The Minimum value is :"+Collections.min(Arrays.asList(num)));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The Maximum value is:"+ Collections.max(Arrays.asList(num)));
    }//findMax

    private static void findSummation(Integer[] num) {
        Integer total = 0;
        for (int val:num)
            total+=val;
        System.out.println("The summation is : "+total);
        findAverage(total);
    }//findSummation

    private static void findAverage(Integer num) {
        System.out.println("The average value is: "+num/MAX);
    }

    private static void showData(Integer[] num) {
        System.out.println("Data in array");
        //enhance loop
        for (int i:num){
            System.out.print(i+"");
        }
        System.out.println();
    }

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();

        }
        return num;
    }
}//class