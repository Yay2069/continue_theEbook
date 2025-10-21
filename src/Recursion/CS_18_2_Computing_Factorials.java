package Recursion;

public class CS_18_2_Computing_Factorials {

    public static void main(String[] args) {

        printMsg("Hello", 2);


    }

    public static long factiorial(int n) {

        if(n == 0) return 1;

        return n * factiorial(n-1);
    }


    //Write a recursive mathematical definition for computing 2^n for a positive integer n.
    public static int twoToPowerOfN(int n) {
        if(n == 1) return 2;

        return 2 * twoToPowerOfN(n-1);
    }


    //Write a recursive mathematical definition for computing x^n for a positive integer n
    //and a real number x.
    public static int xToPowerOfN(int x, int n) {
        if(n == 1) return x;

        return x * xToPowerOfN(x, n-1);
    }


    public static void printMsg(String msg, int times) {
        if(times == 0) return;

        System.out.println(msg);
        printMsg(msg, times-1);
    }


}
