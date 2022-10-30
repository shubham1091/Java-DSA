package Strings;

import java.lang.StringBuilder;

public class Compression {
    /*
     * String compression
     * "aaabbcccdd"
     * "a3b2c3d2"
     */
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(comp(str));
    }

    static String comp(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

}
