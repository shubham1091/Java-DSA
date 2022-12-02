package Stacks;

import java.util.Stack;

public class RevStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        printStack(s);
    }

    private static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    private static void pushBottom(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
            return;
        }
        int temp = s.pop();
        pushBottom(s, top);
        s.push(temp);
    }

    private static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
