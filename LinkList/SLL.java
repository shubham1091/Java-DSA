package LinkList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int idx) {
        if (idx == 0) {
            insertFirst(val);
            return;
        } else if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int delFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delLast() {
        if (size <= 1) {
            return delFirst();
        }
        Node node = get(size - 2);
        int val = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return val;
    }

    public void delFromLast(int idx) {

        if (idx == size) {
            delFirst();
            return;
        }
        int i = 0;
        Node node = head;
        while (i < (size - idx)) {
            node = node.next;
            i++;
        }
        node.next = node.next.next;
    }

    public int delete(int idx) {
        if (idx == 0) {
            return delFirst();
        } else if (idx == size - 1) {
            return delLast();
        }
        Node pre = get(idx - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        size--;
        return val;

    }

    public void reverse() {
        Node pre = null;
        Node crr = tail = head;
        Node ne;

        while (crr != null) {
            ne = crr.next;
            crr.next = pre;
            pre = crr;
            crr = ne;
        }
        head = pre;
        return;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node md = findMid();// slow-fast pointer approach

        // step2 - reverse 2nd half
        Node prev = null;
        Node crr = md;
        Node nex;
        while (crr != null) {
            nex = crr.next;
            crr.next = prev;
            prev = crr;
            crr = nex;
        }
        Node right = prev;// right half head
        Node left = head;// left half head

        // stem3 - check left half & right half
        while (right != null) {
            if (left.value != right.value) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        // floyd's cycle finding algorithm
        Node sl = head;
        Node ft = head;
        while (ft != null && ft.next != null) {
            sl = sl.next;// +1
            ft = ft.next.next;// +2
            if (sl == ft) {
                return true;// cycle exists
            }
        }
        return false;// cycle doesn't exist

    }

    public void rmCycle() {
        // detect cycle
        Node sl = head;
        Node ft = head;
        boolean cycle = false;
        while (ft != null && ft.next != null) {
            sl = sl.next;
            ft = ft.next.next;
            if (sl == ft) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        Node pre = null;
        sl = head;
        while (sl != ft) {
            sl = sl.next;
            pre = ft;
            ft = ft.next;
        }
        // remove cycle
        pre.next = null;
        return;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next != null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right MS

        Node rightHead = mid.next;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // merge
        return merge(left, right);

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node h1, Node h2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (h1 != null && h2 != null) {
            if (h1.value >= h2.value) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h1 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedLL.next;

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
