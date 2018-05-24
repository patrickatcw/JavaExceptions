package com.me;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //step 3 ints
        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y));   //calling method to print
        System.out.println(divideEAFP(x, y));   //calling method to print

        //step 4 run results were both 0

        //step 6 calling divide method to print, crashes "arithmeticexception divide by 0"
        System.out.println(divide(x, y));

    }

    //step 1, "look before you leap" method
    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    //step 2, "easier to ask for forgiveness than permission" method
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    //step 5 method
    private static int divide(int x, int y) {

        return x / y;
    }

}


