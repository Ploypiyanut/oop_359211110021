package ooplab6;

import java.util.StringTokenizer;

public class mystrToken {
    public static void main(String[] args) {

   //     StringTokenizer
        String msg = "welcome to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());


        while (myToken.hasMoreTokens()) {
            StringBuffer myBuff = new StringBuffer(myToken.nextToken());
            System.out.print(myBuff.reverse()+" ");
        }


    }//main
}//class
