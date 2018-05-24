package com.me;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //step 3 ints
       /* int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y));   //calling method to print
        System.out.println(divideEAFP(x, y));   //calling method to print

        //step 4 run results were both 0

        //step 6 calling divide method to print, crashes "arithmeticexception divide by 0"
        System.out.println(divide(x, y));
        */

        //step 7 new int
       /* int x = getInt();
        System.out.println("x is " + x);*/

        //step 10 change above to work with method 9
        /*int x = getIntLBYL();
        System.out.println("x is " + x);*/

        //step 12 testing this method
        int x = getIntEAFP();
        System.out.println("x is " + x);

}

    //step 8 method
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    //step 9 to address input error
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    //step 11, another way than above, try catch
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
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


