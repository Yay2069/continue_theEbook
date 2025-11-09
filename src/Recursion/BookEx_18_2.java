package Recursion;

import java.util.Scanner;

public class BookEx_18_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();

        System.out.println("Fib(" + n + ") = " +
                iterativeFibonacci(n) + " ~ " +
                recursiveFibonacci(n));

    }


    /*(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.*/
    //iterative fibonacci
    private static int iterativeFibonacci(int n) {

        //base case wannabe
        if(n == 0 || n == 1) return n;

        int f0 = 0;
        int f1 = 1;
        int currentFib = 0;

        for(int i = 2; i <= n; i++) {

            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;

        }

        return currentFib;
    }


    //recursive fibonacci
    private static int recursiveFibonacci(int n) {
        //base case
        if(n == 0 || n == 1) return n;

        //recursive call
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }


}
