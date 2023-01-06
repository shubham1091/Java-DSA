package Hashing.Maps.Basics;

import java.util.HashMap;

public class Anagram {
    /*
     * Valid Anagram
     * Given two strings s and t, return true if t is
     * an anagram of s, and false otherwise. An anagram
     * is a word or phrase formed by rearranging the letters
     * of a different word or phrase, typically using all the
     * original letters exactly once.
     */
    public static void main(String[] args) {
        String s = "tulip";
        String t = "lipid";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) != null) {
                if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
