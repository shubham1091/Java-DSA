public class QueueArrCycle {
    int[] arr;
    int size;
    int front;
    int rear;

    public QueueArrCycle(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int data) {
        // checking if the array is full
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // adding first element
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;

    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = arr[front];
        // lear el delete
        if (rear == front) {
            rear = front = -1;
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
