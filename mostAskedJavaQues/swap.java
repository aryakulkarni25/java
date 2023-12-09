//swapping two nos

import java.util.*;
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //logic1- using temp
        /*int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: "+a+" "+b);*/

        //logic2- using + and -
        /*a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: "+a+" "+b);*/

        //logic3- using * and /
        /*a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping: "+a+" "+b);*/

        //logic4- using XOR
        /*a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: "+a+" "+b);*/

        //logic5- single statement
        b = a+b-(a=b);
        System.out.println("After swapping: "+a+" "+b);

    }
}