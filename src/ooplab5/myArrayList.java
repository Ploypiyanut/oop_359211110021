package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("ploy");
        System.out.println(myList);
        myList.add("Tan");
        myList.add("mos");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100)
        System.out.println(myList);
        myList.set(0, "piyanut");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.println(myList);
        System.out.println(myList.indexOf(100));



    }//main
}//class
