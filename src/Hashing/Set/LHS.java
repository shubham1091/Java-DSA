package Hashing.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHS {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<String>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities); 

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
    }
}
