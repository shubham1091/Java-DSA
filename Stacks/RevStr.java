package Stacks;

import java.util.Stack;

public class RevStr {
    public static void main(String[] args) {
        String str = "shubham";
        System.out.println("string brfore reverse : " + str);

        System.out.println("string brfore reverse : " + reverse(str));

    }
    
    // Reverse a string using stack
    public static String reverse(String str) {
        Stack<Character> sc = new Stack<Character>();
        int idx = 0;
        while (idx < str.length()) {
            char ch = str.charAt(idx);
            sc.push(ch);
            idx++;
        }
        StringBuilder ans = new StringBuilder();
        while (!sc.isEmpty()) {
            char curr = sc.pop();
            ans.append(curr);
        }
        return ans.toString();
    }

}
