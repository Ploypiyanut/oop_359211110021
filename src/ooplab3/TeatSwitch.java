package ooplab3;

import java.util.Scanner;

public class TeatSwitch {
    public static void main(String[] args) {
        int select;
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number between 1-3");
//        select = scanner.nextInt();
//        // switch-case
//        switch (select) {
//            case 1: System.out.println("your enter 1"); break;
//            case 2: System.out.println("your enter 2"); break;
//            case 3: System.out.println("your enter 3"); break;
//            default:System.out.println("please enter number between 1-3,Thank you1-3");
//        }//switch
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("A ant");break;
            case 'B': System.out.println("B bird");break;
            case 'C': System.out.println("C cat");break;
            default: System.out.println("D dog");
        }//switch


    }//main



} //main
