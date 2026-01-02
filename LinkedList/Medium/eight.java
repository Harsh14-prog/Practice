package LinkedList.Medium;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int val) {
        this.data = val;
        this.next = null;
        this.bottom = null;
    }
}

public class eight {

    // Insert node at top of bottom list
    public static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.bottom = head;
        return newNode;
    }

    // Print flattened list using bottom pointer
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }
        System.out.println();
    }

    // Merge two sorted linked lists using bottom pointer
    static Node merge(Node list1, Node list2) {

        Node l1 = list1;
        Node l2 = list2;

        Node dummy = new Node(-1);
        Node temp = dummy;

        // Merge like merge-sort
        while (l1 != null && l2 != null) {

            if (l1.data < l2.data) {
                temp.bottom = l1;
                l1 = l1.bottom;
            } 
            else {
                temp.bottom = l2;
                l2 = l2.bottom;
            }
            temp = temp.bottom;
        }

        // Attach remaining nodes
        if (l1 != null) temp.bottom = l1;
        if (l2 != null) temp.bottom = l2;

        return dummy.bottom;
    }

    // Flatten list from right to left
    static Node flatten(Node head) {

        // Base case: last list is already flattened
        if (head == null || head.next == null) {
            return head;
        }

        // Flatten right side first
        Node rightFlattened = flatten(head.next);

        // Merge current list with flattened right list
        return merge(head, rightFlattened);
    }

    public static void main(String[] args) {

        Node head = null;

        // Column 1: 5 -> 7 -> 8 -> 30
        head = push(head, 30);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 5);

        // Column 2: 10 -> 20
        head.next = push(head.next, 20);
        head.next = push(head.next, 10);

        // Column 3: 19 -> 22 -> 50
        head.next.next = push(head.next.next, 50);
        head.next.next = push(head.next.next, 22);
        head.next.next = push(head.next.next, 19);

        // Column 4: 28 -> 35 -> 40 -> 45
        head.next.next.next = push(head.next.next.next, 45);
        head.next.next.next = push(head.next.next.next, 40);
        head.next.next.next = push(head.next.next.next, 35);
        head.next.next.next = push(head.next.next.next, 28);

        // Flatten and print
        head = flatten(head);
        print(head);
    }
}
