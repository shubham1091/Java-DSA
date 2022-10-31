package Recursion;

import java.lang.StringBuilder;

public class Duplicates {
    /*
     * Remove duplicates in a string
     * "appnnacollege"
     */
    public static void main(String[] args) {
        String str = "appnnacollege";
        help(str);
    }

    static void help(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean[] map = new boolean[26];
        for (int i = 0; i < map.length; i++) {
            map[i] = false;
        }
        remove(str, 0, sb, map);

    }

    static void remove(String str, int idx, StringBuilder sb, boolean[] arr) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        // kaam
        char ch = str.charAt(idx);
        if (arr[ch - 'a'] == true) {
            // buplicate
            remove(str, idx + 1, sb, arr);
        } else {
            arr[ch - 'a'] = true;
            remove(str, idx + 1, sb.append(ch), arr);
        }
    }
}
