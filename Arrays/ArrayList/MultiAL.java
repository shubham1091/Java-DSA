package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialisation of 2D arratlist of 3 rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elements
        //for row
        for (int i = 0; i < 3; i++) {
            //for columns
            for (int j = 0; j < 4; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        sc.close();
    }

}
