package Stacks;

import java.util.ArrayList;

public class LIFO {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    // check empty
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // push
    public void push(int data) {
        list.add(data);
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // peak
    public int peak() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return list.get(list.size() - 1);

    }

    public void pushBottom(int data) {
        if (isEmpty()) {
            push(data);
            return;
        }
        int temp = pop();
        pushBottom(data);
        push(temp);
    }

}
