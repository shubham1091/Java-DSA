package String;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // how println is working with different data types
        System.out.println(new int[] { 1, 2, 3, 4 });
        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(56);
        System.out.println(9.5f);
        String name = null;
        System.out.println(name);
    }

}
