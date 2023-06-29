package Array.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 56;
        arr[3] = 67;
        arr[4] = 78;
        // [23, 45, 56, 67,78]
        System.out.println(arr[3]);
        // input using for loop
        // if we don't know size of the array then we can use referenceVariable.length;
        // to get the size of the array
        System.out.println("taking input");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // output
        System.out.println("first way");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
         * we can also do this with enhanced for loop
         * for(int i: referenceVariable){
         * ----System.out.println(i+ " ");
         * }
         */
        System.out.println("second way");
        for (int i : arr) {// for every element in array, print the element
            System.out.println(i + " ");// here i represents element of the array
        }
        // System.out.println(arr[5]); index out of bound erroe
        System.out.println("using toString " + Arrays.toString(arr));
        // simple way internally it is using the for loop only

        // array of objects
        System.out.println("array of objects");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        in.close();
    }

}
