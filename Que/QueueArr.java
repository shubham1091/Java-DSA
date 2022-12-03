public class QueueArr {
    int[] arr;
    int size;
    int rear;

    public QueueArr(int size) {
        this.size = size;
        arr = new int[size];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // adding element in array
    public void add(int val) {
        // checking if array is full
        if (rear == size - 1) {
            System.out.println("queue is full");
            return;
        }
        // actually addin element
        arr[++rear] = val;
    }

    public int peek() {
        // checkin if array is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    public int remove() {
        // checkin if array is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = arr[0];// storiing the value of first element
        // rearrange the array
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return res;
    }

}
