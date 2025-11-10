package Recursion;

public class BookEk_18_4 {

    public static void main(String[] args) {

        System.out.printf("%.4f%n", sum1(25));
        System.out.printf("%.4f", sum2(50));

    }

    /*(Sum series) Write a recursive method to compute the following series:*/

    public static double sum1(int i) {

        if(i == 1) return 1.0;

        return 1.0/i + sum1(i-1);
    }

    public static double sum2(int i) {

        if(i == 1) return 1.0/3;

        return i/(2.0*i+1) + sum2(i-1);
    }
}
