package Stacks;

import java.util.Stack;

public class DPeren {
    /*
     * Given a blaanced expression, find if it contains duplicate parentheses or
     * not.
     * A set of parentheses are duplicate if the same subexpression is surrounded by
     * multiple parentheses
     * Return a true if it contains duplicates else ralse.
     * 
     * example: (((a+(b))))+(c+d)) = true
     * example: ((((a)+(b))+c+d)) = true
     * example: ((a+b)+(c+d)) = false
     * example: (((a+b))+c) = true
     */
    public static void main(String[] args) {
        String str = "(((a+(b))))+(c+d))";
        String str2 = "((a+b)+(c+d))";
        System.out.println(isDP(str));
        System.out.println(isDP(str2));

    }

    // Microsoft , Google
    private static boolean isDP(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count == 0) {
                    return true;// duplicate
                } else {
                    s.pop();// opening pair
                }
            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }

}
