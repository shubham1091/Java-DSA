package Queues;

public class QueCyc {
    int[] arr;
    int size;
    int front;
    int back;

    public QueCyc(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    public boolean isEmpty() {
        return front == -1 && back == -1;
    }

    public boolean isFull() {
        return (back + 1) % size == front;
    }

    public void add(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // add 1st element
        if (front == -1) {
            front = 0;
        }
        back = (back + 1) % size;
        arr[back] = val;

    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int res = arr[front];
        // last el delete
        if (back == front) {
            back = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return res;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}
