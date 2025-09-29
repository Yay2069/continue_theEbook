package Recursion;

public class NumbersExample {

    public static void main(String[] args) {

        //write a function that takes in a number and prints it
        //print first 5 numbers: 1 2 3 4 5

        print1(1);
        print1(2);
        print1(3);
        print1(4);
        print1(5);

        System.out.println("----\n");

        printNum(0);

    }

    static void print1(int num) {
        System.out.println(num);
    }

    public static int printNum(int num) {
        //base case
        if(num == 5) {
            System.out.println(num);
            return num;
        }

        System.out.println(num);
        return printNum(++num);

    }




}
