package Recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {6, 5, 4, 3, 2, 1, 0};

        recursiveSelectionSort(arr);

    }


    //iterative selection sort
    public static void selectionSort(int[] arr) {

        System.out.println("BEFORE: " + Arrays.toString(arr) + "\n\n");
        int min = 0;

        for(int i = 0; i < arr.length-1; i++) {

            min = i;
            for(int j = i+1; j < arr.length; j++) {

                if(arr[j] < arr[min])
                    min = j;

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr));

        }

        System.out.println("\n\nAFTER: " + Arrays.toString(arr));

    }


    //recursive selection sort
    public static void recursiveSelectionSort(int[] arr) {
        helperRecSelSort(arr, 0, arr.length-1);
    }

    public static void helperRecSelSort(int[] arr, int low, int high) {

        if(low < high) {


            int min = low;
            for (int i = low+1; i <= high; i++) {

                if(arr[i] < arr[min])
                    min = i;

            }

            int temp = arr[low];
            arr[low] = arr[min];
            arr[min] = temp;

            System.out.println(Arrays.toString(arr));

            helperRecSelSort(arr, low+1, high);
        }

    }

}
