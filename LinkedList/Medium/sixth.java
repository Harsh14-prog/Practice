package LinkedList.Medium;

// add 1 to linkedList --->>> normal

class Node {
    int data ;
    Node next ;

    Node(int val){
        this.data = val ;
        this.next = null ;
    }
}

public class sixth {

    public static Node createLL(int[] nums){

       Node head = new Node(nums[0]);

       Node temp = head ;

       for(int i = 1 ; i < nums.length ; i++){
         temp.next = new Node(nums[i]);
         temp = temp.next ;
       }

       return head ;
    }

    public static Node reverse(Node head){
        Node curr = head ;
        Node prev = null ;
        
        while(curr != null){

            Node forward = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = forward ;
        }

        return prev ;
    }

    public static void printLL(Node head){
        
        Node temp = head ;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }

    public static Node addOne(Node head , int carry){
         
        Node newHead = reverse(head);

        Node temp = newHead ;
        while(temp != null && carry > 0){

            int sum = temp.data + carry ;
            temp.data = sum % 10 ;
            carry = sum / 10 ;

            temp = temp.next ;
        }

        if(carry > 0){
            Node newNode = new Node(carry);
            newNode.next = newHead ;
            newHead = newNode ;
        }

        Node reversedHead =  reverse(newHead);

        return reversedHead;
    }


    public static void main(String[] args) {

        int[] nums = {9,9,9,9};
        Node head = createLL(nums);

        Node newHead = addOne(head , 1);

        printLL(newHead);
    }
}
