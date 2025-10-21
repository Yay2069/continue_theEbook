package Recursion;

public class RecursivePalindrome {

    public static void main(String[] args) {

        iterativePalindrome("abbba");
        iterativePalindrome("mom");
        iterativePalindrome("abbbba");
        iterativePalindrome("abdba");
        iterativePalindrome("abdaba");

        System.out.println("-------------");

        recursivePalindrome("abbba");
        recursivePalindrome("mom");
        recursivePalindrome("abbbba");
        recursivePalindrome("abdba");
        recursivePalindrome("abdaba");


    }

    //iterative solution
    public static void iterativePalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                System.out.println(s + " is not a palindrome");
                return;
            }

            left++;
            right--;

        }

        System.out.println(s + " is a palindrome");
    }


    //recursive solution
    public static void recursivePalindrome(String s) {

        if (recursiveHelper(s, 0, s.length()-1)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

    }

    public static boolean recursiveHelper(String s, int l, int r) {
        if(l >= r) {
            return true;
        } else if(s.charAt(l) != s.charAt(r)) {
            return false;
        } else {
            return recursiveHelper(s, l+1, r-1);
        }

    }


}
