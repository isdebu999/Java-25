package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;


    public void addNodeFirst(int x) {
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // 2 ->  1
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int x) {
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    //Add the node at particular index..
    public void addIndex(int index, int x){
        if(index == 0){
            addNodeFirst(x);
        }

        Node tem = head;
        int i = 0;
        while(i < index - 1){
            tem = tem.next;
            i++;
        }

        Node newNode = new Node(x);
        size++;
        newNode.next = tem.next;
        tem.next  = newNode;
    }

    public void deleteFirstNode(){
        if(head == null){
            System.out.println("LL is Empty!");
        }
        int deleteEle = head.data;
        head = head.next;
        size--;

        System.out.println("Delete First Node : " + deleteEle);
    }


    public void deleteLastNode(){

        if(tail == null ||  head == null){
            System.out.println("LL is Empty!");
        }

        Node tem = head;
        while(tem.next.next != null){
            tem = tem.next;
        }
        int x = tem.next.data;
        tem.next = null;
        size--;
        System.out.println("Delete Last Node : " + x);
    }


    public void printLL(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
}

public class Implementation {
    public static void main(String[] args) {

        LinkedList ll  = new LinkedList();
        ll.addNodeFirst(21);
        ll.addNodeFirst(31);
        ll.addNodeFirst(41);
        ll.addLast(45);
        ll.addLast(90);
        ll.addIndex(2, 9);
//        System.out.println("After Perform the delete Operations!!!");
//        ll.printLL();
//        System.out.println("SIZE: " + LinkedList.size);


//        System.out.println("Before Perform the delete Operations!!!");
        ll.deleteFirstNode();

        System.out.println("SIZE: " + LinkedList.size);
        ll.deleteLastNode();
        ll.printLL();
    }
}
