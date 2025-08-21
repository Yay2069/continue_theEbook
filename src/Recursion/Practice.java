package Recursion;

public class Practice {

    //Data fields



    public static void main(String[] args) {

        //write a function that prints hello world

            message();




    }


    //Functions

    public static void message() {
        System.out.println("Hello World (-)");
        message1();
        System.out.println("exit from (-)");
    }

    public static void message1() {
        System.out.println("Hello World (1)");
        message2();
        System.out.println("exit from (1)");
    }

    public static void message2() {
        System.out.println("Hello World (2)");
        message3();
        System.out.println("exit from (2)");
    }

    public static void message3() {
        System.out.println("Hello World (3)");
        message4();
        System.out.println("exit from (3)");
    }

    public static void message4() {
        System.out.println("Hello World (4)");
        System.out.println("exit from (4)");
    }





    //----------------------------------------------------------------------
}
