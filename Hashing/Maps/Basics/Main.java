package Hashing.Maps.Basics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Code<String, Integer> hm = new Code<>();
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("US", 50);
        hm.put("Nepal", 10);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
