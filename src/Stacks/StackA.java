package Stacks;

public class StackA {
    public static void main(String[] args) {
        LIFO ar = new LIFO();
        ar.push(1);
        ar.push(2);
        ar.push(3);
        ar.push(4);
        ar.push(5);
        ar.pushBottom(6);
        while (!ar.isEmpty()) {
            System.out.println(ar.peak());
            ar.pop();
        }
        System.out.println("\n");
        SList list = new SList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        while (!list.isEmpty()) {
            System.out.println(list.peak());
            list.pop();
        }
    }
}