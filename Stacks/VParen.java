package Stacks;

import java.util.Stack;

public class VParen {
    /*
     * Given a string a containging just the characters
     * '(', ')','{','}','[',']'
     * determine if the input string is valid string is valid
     * An inpu string is valid if:
     * 1->Open breackets must be closed by the same type of brackets.
     * 2->Open brackets must be closed in the correct order.
     * 3-> Every close bracket has a corresponding open bracket of the same type.
     */
    public static void main(String[] args) {
        System.out.println(isValid("({[]}()())"));
    }

    private static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.empty()) {
                    return false;
                }
                boolean cf = (st.peek() == '(' && ch == ')');
                boolean cs = (st.peek() == '[' && ch == ']');
                boolean ct = (st.peek() == '{' && ch == '}');
                if (cf || cs || ct) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
