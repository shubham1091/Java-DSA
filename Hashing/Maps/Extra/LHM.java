package Hashing.Maps.Extra;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LHM {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        System.out.println(hm);
        System.out.println(lhm);
    }
}
