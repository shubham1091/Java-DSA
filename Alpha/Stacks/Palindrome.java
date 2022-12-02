package Alpha.Stacks;

import java.util.Stack;

public class Palindrome {
    /*
     * Palindrome Linked list
     * we have a singly linked list of characters, write a function
     * that returns true if the given list is a palindrome, else,false.
     * example: A->B->c->B->A
     * output :Yes it is palindrome
     */public static void main(String[] args) {
        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');
        
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
       
        if (isPal(one)) {
            System.out.println("Yes it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }

    private static boolean isPal(Node list) {
        Node temp = list;
        boolean check = true;
        Stack<Character> st = new Stack<Character>();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.ptr;
        }
        while (list != null) {
            char i = st.pop();
            if (list.data == i) {
                check = true;
            } else {
                check = false;
                break;
            }
            list = list.ptr;
        }
        return check;
    }
}

class Node {
    char data;
    Node ptr;

    Node(char d) {
        ptr = null;
        data = d;
    }
}
