import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Queue using array");
        QueueArr arr = new QueueArr(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        while (!arr.isEmpty()) {
            System.out.println(arr.peek());
            arr.remove();
        }

        System.out.println("Queue using array in cyclic fashion");

        QueueArrCycle cyc = new QueueArrCycle(3);
        cyc.add(1);
        cyc.add(2);
        cyc.add(3);
        System.out.println("removed : " + cyc.remove());// 1
        cyc.add(4);
        System.out.println("removed : " + cyc.remove());// 2
        cyc.add(5);
        // 3 4 5
        while (!cyc.isEmpty()) {
            System.out.println(cyc.peek());
            cyc.remove();
        }

        System.out.println("Queue using Linked list");

        QueueLink ls = new QueueLink();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        while (!ls.isEmpty()) {
            System.out.print(ls.peek() + "->");
            ls.remove();
        }
        System.out.println("null");

        System.out.println("Queue using java collection framework");
        Queue<Integer> qL = new LinkedList<>();// or use ArrayDeque insted of linkedlist
        qL.add(1);
        qL.add(2);
        qL.add(3);
        while (!qL.isEmpty()) {
            System.out.println(qL.peek());
            qL.remove();
        }
    }

}
