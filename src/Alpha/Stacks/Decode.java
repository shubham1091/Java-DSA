package Alpha.Stacks;

import java.util.Stack;

public class Decode {
    /*
     * Decode a string
     * we have an encoded string s and the task is to
     * decode it . The pattern is which the strings are
     * encoded is as follows
     * sample input 2[cv]
     * sample output cvcv
     * sample input 3[b2[v]]l
     * sample output bvvbvvbvv
     */
    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        System.out.println(code(str));

    }

    private static String code(String str) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> intStack = new Stack<Integer>();
        String temp = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                intStack.push(count);
            } else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;
                if (!intStack.empty()) {
                    count = intStack.pop();
                }
                while (!stack.empty() && stack.peek() != '[') {
                    temp = stack.pop()+ temp;
                }
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                }
                for (int j = 0; j < count; j++) {
                    result = temp + result;
                }
                for (int j = 0; j < result.length(); j++) {
                    stack.push(result.charAt(j));
                }
                result = "";
            } else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1))) {
                    stack.push(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                    intStack.push(1);
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        while (!stack.empty()) {
            result = stack.pop() + result;
        }
        return result;
    }
}
