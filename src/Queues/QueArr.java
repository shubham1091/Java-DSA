package Queues;

public class QueArr {
    int[] arr;
    int size;
    int rear;

    public QueArr(int si) {
        this.size = si;
        this.arr = new int[size];
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void add(int val) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = val;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[0];
    }
}
