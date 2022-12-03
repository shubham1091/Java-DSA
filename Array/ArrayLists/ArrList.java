package Array.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * Syntax
         * ArrayList<datatype> referenceVariable = new ArrayList<datatype>();
         * Not in the place of datatype we can not pass primitives
         * arraylist is part of java collection framework
         * similar to vectors in c++
         */
        ArrayList<Integer> list = new ArrayList<>(4);
        // how to work with array list
        list.add(25);// O(1)
        list.add(2);
        list.add(52);
        list.add(94);
        list.add(67);
        list.add(25);
        list.add(2566);

        list.add(1, 4);// adding 4 at index 1 O(n)

        System.out.println(list.contains(357));// toc check if abaliable in the list O(n)

        System.out.println(list);// printing the list

        list.set(0, 44);// changing the element at index 0 to 44 O(n)

        System.out.println(list);

        list.remove(2);// O(n)

        // Input
        for (int i = 0; i < 7; i++) {
            list.add(in.nextInt());
        }
        // output => list.get(index) time complexity is O(1)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            // pass index here, list[index] syntax will not work here
        }
        System.out.println();
        /*
         * How arraylist works
         * (1) size is fixed internally
         * (2) say arraylist fills by some amount
         * => it will create a new arraylist of say double the size
         * => old elements are copied in new list
         * => old one get deleted
         */
        System.out.println(list);
        Collections.sort(list);
        //to sort in decending order Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        in.close();
    }

    static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

}
