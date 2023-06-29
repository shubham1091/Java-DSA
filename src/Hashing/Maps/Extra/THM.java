package Hashing.Maps.Extra;

import java.util.HashMap;
import java.util.TreeMap;

public class THM {
    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<String, Integer>();
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("USA", 50);

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        System.out.println(hm);
        System.out.println(thm);
    }
}
