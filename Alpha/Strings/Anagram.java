package Alpha.Strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String srt = sc.next();
        System.out.println(isAnagram(str, srt));
        sc.close();

    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean cc = true;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    cc = true;
                    break;
                } else {
                    cc = false;
                }
            }
            // cc = cc && true;
            if (cc == false) {
                break;
            }
        }
        return cc;
    }

}
