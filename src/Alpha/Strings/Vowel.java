package Alpha.Strings;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String css = sc.next();
        System.out.println(low(css));
        sc.close();

    }

    static int low(String sc) {
        int tot = 0;
        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                tot++;
            }
        }
        return tot;
    }
}
