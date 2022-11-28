package LinkList;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("singly linked list");
            SLL list = new SLL();
            list.insertFirst(3);
            list.insertFirst(5);
            list.insertLast(22);
            list.insertLast(57);
            list.insertLast(7);
            list.insert(6, 2);
            list.display();
            System.out.println(list.delFirst());
            list.display();
            System.out.println(list.delLast());
            list.display();
            System.out.println(list.delete(2));
            list.display();
            System.out.println("is given list a palindrome : " + list.palindrome());
            System.out.println(list.isCycle());
        }

        {
            // dubly linked list
            System.out.println("Dubly linked list");
            DLL list = new DLL();
            list.insertFirst(3);
            list.insertFirst(5);
            list.insertLast(22);
            list.insertLast(57);
            list.insertLast(7);
            list.insert(6, 3);
            list.display();
            list.Rev();
        }

        {
            System.out.println("circuler linked list");
            CLL list = new CLL();
            list.insert(23);
            list.insert(3);
            list.insert(19);
            list.insert(75);
            list.display();
        }

    }
}