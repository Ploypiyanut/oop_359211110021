package ooplab3;

public class TestNestedLoop {
    public static void main(String[] args) {
//        Nested Loop
        int x = 1,m=15;

        for (int i =1;i<=8;i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 8 || j == i || j == 1 || j == 8 || i == 1)
                    System.out.print("*\t");
                else if (i > j) {
                    System.out.print(x + "\t");
                    x++;
                } else {
                    System.out.print(m + "\t");
                    m--;
                }
            }//j
            System.out.println();
        }//i


    }//main
}//class
