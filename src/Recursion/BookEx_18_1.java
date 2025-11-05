package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class BookEx_18_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.print("Enter n: ");

            BigInteger n = new BigInteger(sc.nextLine());

            if(n.equals(new BigInteger("-1"))) break;

            System.out.println("fact(" + n +"): " + fact(n));

        }

        System.out.println("Program DONE..");

    }

    /*(Factorial) Using the BigInteger class introduced in Section 10.9, you can
        find the factorial for a large number (e.g., 100!). Implement the factorial
        method using recursion. Write a program that prompts the user to enter an inte
        ger and displays its factorial.*/

    public static BigInteger fact(BigInteger n) {
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return n.multiply(fact(new BigInteger(String.valueOf(n.subtract(BigInteger.ONE)))));
    }


}
