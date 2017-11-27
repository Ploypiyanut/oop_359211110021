package ooplab3;

public class TeatCondition {

    public static void main(String[] args) {

      // if
        int x =10, y =20;
        if (x<y) {
            System.out.println("x less than y");
        }
        else {
            System.out.println("x more than y");
        }

     // if-else-if
        if (y>30){
            System.out.println("y less than 30");
        }
        else if (y>=20){
            System.out.println("y equal than 20");
            if (x+y >=30)
                System.out.println("x+y =30");
        }
        else {
            System.out.println("y more than 20");
        }


        System.out.println("oop");
        System.out.println("IS221");



    }//main

}//class
