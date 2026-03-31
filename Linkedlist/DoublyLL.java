import java.util.*;

class DLL {

    private Node head;

    private class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;

    }

    public void insertlast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.previous = last;
    }

    public void display() {
        Node tempNode = head;
        Node last = null;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            last = tempNode;

            tempNode = tempNode.next;
        }
        System.out.println("END");

        System.out.println("printing in reverse");

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("START");

    }

    public Node search(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null; // value not found
    }

    // insert the value after the given node

    public void insertParticular(int after, int value){
        Node p = search(after) ; // p is that node after which insert the new node.
        if(p == null){
            System.out.println("Doesn't exist");
            return ;
        }
        
        Node node = new Node(value);
        node.next = p.next ;
        p.next = node ;
        node.previous = p ;
        p.next = node ;
        if(node.next != null){
            node.next.previous = node ;    
        }
     

    }

}

public class DoublyLL {
    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);

        list.insertlast(56);

        list.insertParticular(4, 6);

        list.display();

    }

}
