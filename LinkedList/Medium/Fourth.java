package LinkedList.Medium;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Fourth {

    Node head;
    Node tail;

    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void segrigate(){

        Node oddDummy = new Node(-1); 
        Node odd = oddDummy;
        Node evenDummy = new Node(-1) ;
        Node even = evenDummy;

        Node temp = head ;

        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp ;
                even = even.next ;
            }
            else{
                odd.next = temp ;
                odd = odd.next ;
            }
            temp = temp.next ;
        }

        odd.next = null;
        even.next = null ;

        System.out.println("\nodd list : ");
        printList(oddDummy.next);

        System.out.println("\neven list : ");
        printList(evenDummy.next);
    }
    public static void main(String[] args) {

        Fourth list = new Fourth();
        list.addLast(10);
        list.addLast(51);
        list.addLast(7);
        list.addLast(40);
        list.addLast(3);
        list.addLast(60);
        list.addLast(9);

        System.out.println("original list is : ");
        list.printList(list.head);

        list.segrigate();
    }
}
