package Hashing.Maps.Basics;

import java.util.HashMap;

public class Majority {
    /*
     * Majority element
     * Given an integer array of size n, find all elements
     * that appear more then [n/3] times
     * input :
     * {1,3,2,5,1,3,1,5,1}
     * output :
     * 1
     */
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        /*
         * for (int i = 0; i < arr.length; i++) {
         * if (map.containsKey(arr[i])) {
         * map.put(arr[i], map.get(arr[i]) + 1);
         * } else {
         * map.put(arr[i], 1);
         * }
         * }
         */
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int n = arr.length / 3;
        for (Integer key : map.keySet()) {
            if (map.get(key) > n) {
                System.out.println(key);
            }
        }
    }
}
