package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Queue using array");
        QueArr arr = new QueArr(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        while (!arr.isEmpty()) {
            System.out.print(arr.peek() + " ");
            arr.remove();
        }
        System.out.println();

        System.out.println("Queue using array cycle");
        QueCyc cyc = new QueCyc(3);
        cyc.add(1);
        cyc.add(2);
        cyc.add(3);
        System.out.println("removed : " + cyc.remove());
        cyc.add(4);
        System.out.println("removed : " + cyc.remove());
        cyc.add(5);
        while (!cyc.isEmpty()) {
            System.out.print(cyc.peek() + " ");
            cyc.remove();
        }
        System.out.println();

        System.out.println("Queue using Linked list");
        QueList list = new QueList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        while (!list.isEmpty()) {
            System.out.print("" + list.peek() + "->");
            list.remove();
        }
        System.out.println("null");

        System.out.println("Queue using Java collection framework");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();

        System.out.println("Queue using 2 stack approche");
        QueStk st = new QueStk();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (!st.isEmt()) {
            System.out.print(st.pek() + " ");
            st.remove();
        }
        System.out.println();

        System.out.println("Stacks using 2 Queues approach");
        Stk stk = new Stk();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        while (!stk.isEmpty()) {
            System.out.print(stk.pek() + " ");
            stk.pop();
        }
        System.out.println();

    }
}
