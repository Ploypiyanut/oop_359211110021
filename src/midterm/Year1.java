package midterm;

import java.util.Scanner;

public class Year1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Year1 l = new Year1();
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter year " + i + " :");
            int a = in.nextInt();
            System.out.println("Age" + i + ": " + l.calculate(a));
        }
        System.out.println("Thank you.");
    }
    public int calculate(int l){
        int sum;
        return  sum = 2561-l;

    }//main

}//class
