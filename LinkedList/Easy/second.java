package LinkedList.Easy;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListCycle {
    Node head;
    Node tail;

    public void addFirst(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

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

    public void createCycle(int pos) {
        Node temp = head;
        int index = 0;

        while (temp != null && index < pos) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("invalid position " + pos);
            return;
        }

        tail.next = temp;

    }

    public boolean hasCycle() {

        if (head == null || head.next == null)
            return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node getStartOfCycle() {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                slow = head ;

                while(slow != fast){
                    fast = fast.next ;
                    slow = slow.next ;
                }
                return slow ;
            }
        }
        return null ;  // bez cycle is not detected
    }

    public void removeCycle(){

        Node start = getStartOfCycle();
        if(start == null){
            System.out.println("no cycle present in LL");
            return ;
        }

        Node temp = start ;
        while(temp.next != start){
            temp = temp.next ;
        }
        temp.next = null ;
        tail = temp ;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

public class second {
    public static void main(String[] args) {

        LinkedListCycle list = new LinkedListCycle();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        System.out.println("singly Linkedlist : ");
        list.printList();

        list.createCycle(2);

        System.out.println(list.hasCycle());

        System.out.println(list.getStartOfCycle().data);

    }
}
