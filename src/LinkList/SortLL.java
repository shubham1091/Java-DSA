package LinkList;

public class SortLL {


    public static void main(String[] args) {
        // Merge sort on linked list
        SLL list = new SLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.display();
        list.mergeSort(list.find(9));
        list.display();

    }

}
