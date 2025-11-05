package Recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {-5, -3, -1, 1, 3, 6, 9, 13, 15, 23, 28, 33};

        System.out.println(itBinarySearch(arr, -5));
        System.out.println(itBinarySearch(arr, 33));
        System.out.println(itBinarySearch(arr, -3));
        System.out.println(itBinarySearch(arr, 3));
        System.out.println(itBinarySearch(arr, 28));
        System.out.println(itBinarySearch(arr, 7));

        System.out.println("\n------");
        System.out.println(recBinarySearch(arr, -5));
        System.out.println(recBinarySearch(arr, 33));
        System.out.println(recBinarySearch(arr, -3));
        System.out.println(recBinarySearch(arr, 3));
        System.out.println(recBinarySearch(arr, 28));
        System.out.println(recBinarySearch(arr, 7));

    }


    //iterative binary search

    /* KEY POINTS
           -the array must be sorted!!
           -we got: left index, mid index, right index
           -the mid index is (left+right) / 2
           -if the mid == our search exit the loop
           -if our search > mid we search in right side and left will be mid + 1
           -if our search < mid we search in left side and right will be mid - 1
           -if left > right we return 1 so our search is not inside the array
    * */

    public static int itBinarySearch(int[] arr, int search_value) {

        //this function will return the position of the 'search_value', if not will return -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {

            int middle = (start + end) / 2;

            if(arr[middle] == search_value) {
                return middle;
            }

            if(arr[middle] > search_value)
                end = middle-1;
            else if(arr[middle] < search_value)
                start = middle+1;

        }

        return -1;
    }


    //recursive binary search

    public static int recBinarySearch(int[] arr, int search_value) {

        return binarySearchHelper(arr, search_value, 0, arr.length-1);

    }

    public static int binarySearchHelper(int[] arr, int search_value, int start, int end) {

        int middle = (start + end) / 2;

        if(start <= end) {

            if (arr[middle] == search_value)
                return middle;

            if (arr[middle] > search_value)
                return binarySearchHelper(arr, search_value, start, middle-1);
            else if(arr[middle] < search_value)
                return binarySearchHelper(arr, search_value, middle+1, end);


        }

        return -1;
    }


}
