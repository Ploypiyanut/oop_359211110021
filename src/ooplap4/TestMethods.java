package ooplap4;

public class TestMethods {
    public static void A(){
        System.out.println("Hello A");
    }
    public static void B(int x,int y, String s){
        System.out.println(s);
    }
    public static  int c (int x, int y){
        return x+y;
    }



    public static void main(String[] args) {

//        protected
//        private
        A();
        int x = 5, y = 10;
        B(x,y,"Hello");
//        Manage return value
//1.
        int z = c(x, y);
        System.out.println(z);
//2.
        System.out.println(c(x,y));



    }//main

} //class
