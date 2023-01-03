package Hashing.Maps;

import java.util.HashMap;

public class Hm {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> h = new HashMap<String, Integer>();

        // Insert - O(1)
        h.put("India", 100);
        h.put("China", 150);
        h.put("US", 50);
        h.put("Japan", 6);
        h.put("Nepal", 5);

        System.out.println(h);

        // Get -O(1)
        int population = h.get("India");
        System.out.println(population);
        System.out.println(h.get("Indonesia"));

        // ContainsKey -O(1)
        System.out.println(h.containsKey("India"));
        System.out.println(h.containsKey("Indonesia"));

        // Remove -O(1)
        System.out.println(h.remove("China"));
        System.out.println(h);

        // Size
        System.out.println(h.size());

        // Is Empty
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());

    }
}
