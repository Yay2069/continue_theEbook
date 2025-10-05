package Recursion;

public class CS_18_2_Computing_Factorials {

    public static void main(String[] args) {

        System.out.println(factiorial(5));


    }

    public static long factiorial(int n) {

        if(n == 0) return 1;

        return n * factiorial(n-1);
    }


}
