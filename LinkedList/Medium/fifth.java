package LinkedList.Medium ;


// add 1 to linkedList ------  recursive

class Node {
    int data ;
    Node next ;

    Node(int val){
        this.data = val ;
        this.next = null ;
    }
}

public class fifth {

    public static Node createLL(int[] nums){
        Node head = new Node(nums[0]);
        Node temp = head ;

        for(int i = 1 ; i < nums.length ; i++){
            temp.next = new Node(nums[i]);
            temp = temp.next ;
        }
        return head ;
    }

    public static void display(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public static int addOne(Node head){

        if(head == null){
            return 1;
        }

        int carry = addOne(head.next);

        int sum = head.data + carry;
        head.data = sum % 10;
        carry = sum / 10;

        return carry;
    }

    public static void main(String[] args) {
        
        int[] nums = {9,9,9,9};
        Node head = createLL(nums);

        display(head);

        int newCarry = addOne(head);

        if(newCarry > 0){
           Node newNode = new Node(newCarry);
           newNode.next = head ;
           head = newNode ;
        }

        display(head);   // 1->0->0->0->0->null
    }
}
