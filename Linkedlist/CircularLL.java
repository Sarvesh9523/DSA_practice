class CLL{
    private Node head;
    private Node tail;
    public CLL(){
        this.head = null;
        this.tail = null ;

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

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node ;
            return ; 
        }
        tail.next = node ;
        node.next = head ;
        tail = node ;
        
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next ;
            }
            while(node != head) ;
        }
        System.out.println("HEAD");
    
    }

    public void delete(int value){
        Node node = head ;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head ;
            return ;

        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next ;
                break ;
            }
            node = node.next ;
        }while(node != head) ;
    }
}



public class CircularLL {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.delete(3);

        list.display();


        
    }
    
}
