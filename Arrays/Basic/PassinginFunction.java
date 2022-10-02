package Arrays.Basic;

import java.util.Arrays;
//string are immutable in java 
//array are mutable in java

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }

}
