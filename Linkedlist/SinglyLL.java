class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
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
        public String toString(){
            return "Node{value=" + value + "}";
        }
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return ;
        }
        Node node = new Node(val);
        tail.next = node ;
        tail = node ;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertfirst(val) ;
            return;
        }
        if(index == size){
            insertlast(val) ;
            return;
        }

        Node temp = head ;
        for(int i=1; i<index; i++){
            temp = temp.next ;
        }
        Node node = new Node(val, temp.next) ;
        temp.next = node ;
        size++ ;
    }

    //insert using recursion
    public void insertR(int value, int index){
        head = insertRec(value, index, head);

    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp ;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;

    }

    public void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value +" -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }

    public int deletefirst(){
        int val = head.value ;
        head = head.next ;
        if(head == null){
            tail = null ;
        }
        size--;
        return val ;

    }
    public Node get(int index){
        Node node = head ;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node ;
    }
    public int deletelast(){
        if(size <= 1){
            return deletefirst() ;
        }
        Node secondLast = get(size-2) ;
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val ;
    }

    public int delete(int index){
        if(index == 0){
            return deletefirst() ;
        }
        if(index == size){
            return deletelast();
        }

        Node previous = get(index-1);
        int val = previous.next.value ;
        previous.next = previous.next.next ;
        return val ;

    }
    public int search(int value){
        Node node = head ;
        int index = 0;
        while(node != null){
            if(node.value == value){
                return index ;
            }else{
                node = node.next  ;
                index++ ;
            }
        }
        return -1 ;
    }

    // Random question from leetcode 
    // question no.83
    public void RemoveDuplicate(){
        Node temp = head ;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next ;
                size--;
            }else{
                temp = temp.next ;
            }
        }
        tail = temp ;
        tail.next = null ;
    }

    // question no.21

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL newlist = new LL() ;

        while(f != null && s != null){
            if(f.value < s.value){
                newlist.insertlast(f.value) ;
                f = f.next ;
            }else{
                newlist.insertlast(s.value);
                s = s.next ; 
            }
        }
        while(f != null){
            newlist.insertlast(f.value) ;
            f = f.next ;
        }
        while(s != null){
            newlist.insertlast(s.value) ;
            s = s.next ;
        }
        return newlist ;
    }

    // reversing the list
    public void reverse(Node node){
        if(node == tail){
            head = tail ;
            return ;

        }
        reverse(node.next);
        tail.next = node ;
        tail = node ;
        tail.next = null ;

    }

    public void reverse2(){
        if(size < 2){
            return ;
        }
        Node prev = null;
        Node present = head ;
        Node next = present.next ;
        while (present != null){
            present.next = prev ;
            prev = present ;
            present = next ;
            if(next != null){
                next = next.next ;
            }
        }
        head = prev ;
    }
}



public class SinglyLL {
    public static void main(String[] args) {
        // LL list = new LL();

        // list.insertfirst(1);
        // list.insertfirst(1);
        // list.insertfirst(1);
        // list.insertfirst(4);
        // list.insertfirst(4);
        // list.insertfirst(4);
        // list.insertfirst(7);
        // list.insertfirst(7);
        // list.insertfirst(9);
        // list.insertfirst(10);

        // // list.display();

        // // list.insertlast(90) ;
        // // list.insert(89, 3) ;

        // // list.display() ;

        // // System.out.println(list.deletefirst()) ;
        // // list.display();
        // // System.out.println(list.deletelast()) ;
        // // System.out.println(list.delete(3)) ;
        // // list.display() ;
        // // System.out.println("The node  is present at " + list.search(4)) ;

        // // list.insertR(67, 7);
        // list.RemoveDuplicate();
        // list.display();

        LL first = new LL() ;
        LL second = new LL() ;

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LL ans = LL.merge(first, second) ;
        ans.display();




    }
}



