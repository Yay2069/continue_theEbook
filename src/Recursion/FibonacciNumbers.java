package Recursion;

public class FibonacciNumbers {

    public static void main(String[] args) {

        for (int i = 0; i <= 15; i++) {
            System.out.println(fib(i));
        }

    }


    /*
    necesita optimizare pentru ca aceasta functie e mai mult un brute force
    care nu poate sa arate pentru un n mic ca de ex fib(50) deoarece face apelari
    la functie care se tot repeta
        fib(50) = fib(49) + fib(48)
        fib(49) = fib(48) + fib(47)
        -> se repeta fiecare ramura a arborelui recursiv de ex fib(48) si tot asa
     */
    public static int fib(int num) {
        if(num == 0 || num == 1) {
            return num;
        }

        return fib(num-1) + fib(num-2);

    }




}
