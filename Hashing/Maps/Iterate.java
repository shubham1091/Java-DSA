package Hashing.Maps;

import java.util.HashMap;
import java.util.Set;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Japan", 6);
        map.put("Nepal", 5);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println("key = " + key + ", value = " + map.get(key));
        }

    }

}
