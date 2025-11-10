package Recursion;

import java.util.Scanner;

public class BookEx_18_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("Enter m (space) n: ");

            int m = sc.nextInt(), n = sc.nextInt();

            if(m == -1 || n == -1) break;

            System.out.println("gcd(" + m + ", " + n + ") = " +
                    gcd(m, n));

        }

    }

    /*(Compute greatest common divisor using recursion)*/

    public static int gcd(int m, int n) {

        if(m % n == 0) return n;

        return gcd(n, m % n);
    }


}
