package LinkedList.Medium;
 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class third {

    // Add node at end
    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        
        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Reverse a linked list
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    // Palindrome function
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        // Step 1: Middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare halves
        Node p1 = head;
        Node p2 = secondHalf;
        boolean flag = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                flag = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Step 4: Restore list 
        slow.next = reverse(secondHalf);

        return flag;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;
        head = addLast(head, 3);
        head = addLast(head, 7);
        head = addLast(head, 5);
        head = addLast(head, 7);
        head = addLast(head, 3);

        System.out.print("List: ");
        printList(head);

        System.out.println("Is Palindrome? " + isPalindrome(head));

        System.out.print("After check (restored): ");
        printList(head);
    }
}
