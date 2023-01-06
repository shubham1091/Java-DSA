package Hashing.Set;

import java.util.HashSet;

public class Simple {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("yes");
        }
        set.remove(2);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }

}
