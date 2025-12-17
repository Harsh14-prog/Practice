package LinkedList.Easy;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {

    Node head;
    Node tail;

    public void addFirst(int data) {

        Node newNode = new Node(data);
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

    public void insertAtPosition(int position, int value) {

        if (position < 0 || position > getLength()) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            addFirst(value);
            return;
        }

        if (position == getLength()) {
            addLast(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {

        int length = getLength();

        if (position < 0 || position >= length) {
            System.out.println("invalid position");
            return;
        }

        if (position == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        Node nodeTodelete = temp.next;
        temp.next = nodeTodelete.next;

        if (nodeTodelete == tail) {
            tail = temp;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("LL already empty");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        int length = getLength();
        if (length == 0) {
            System.out.println("LL is already empty");
            return;
        }
        deleteAtPosition(length - 1); // 0-based hence -1
    }

    public void deleteMiddle() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle node
        prev.next = slow.next;

        // update tail if we deleted last node (rare case on even length lists)
        if (slow == tail) {
            tail = prev;
        }
    }

    public Node reverseLLNormal(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        return prev;
    }

    public Node reverseRec(Node prev, Node curr) {

        if (curr == null) {
            return prev;
        }
        Node forward = curr.next;
        curr.next = prev;
        return reverseRec(curr, forward);
    }

    public void reverseLL() {
        tail = head; // old head becomes tail after reverse
        head = reverseRec(null, head); // new head returned
    }

    public int getLength() {

        Node temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    public Node getMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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

public class first {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        list.addLast(100);
        list.addLast(110);

        list.deleteFirst();

        list.printList();
        System.out.println();

        // Reverse the LinkedList -------- Normal ierative
        // list.tail = list.head; // old head becomes tail
        // list.head = list.reverseLLNormal(list.head);

        // recursive reverse --->>>>
        // list.reverseLL();
        // System.out.println("\nReversed List:");
        // list.printList(list.head);

        // int length = list.getLength();
        // System.out.println("\n" + length);

        // System.out.println(list.search(110));

        // list.insertAtPosition(3, 150);
        // list.printList();

        // Node middle = list.getMiddle();
        // System.out.println("Middle is : " + middle.data);

        list.deleteMiddle();
        list.printList();
    }
}
