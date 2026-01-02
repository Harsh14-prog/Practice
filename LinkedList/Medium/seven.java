package LinkedList.Medium;

class Node {
    int data ;
    Node next ;

    Node(int val){
        this.data = val ;
        this.next = null ;
    }
}

public class seven {

    public static Node createLL(int[] nums){
        Node head = new Node(nums[0]);
        Node temp = head ;

        for(int i = 1 ; i < nums.length ; i++){
            temp.next = new Node(nums[i]);
            temp = temp.next ;
        }

        return head;
    }

    public static void display(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public static Node addLL(Node head1 , Node head2){

        Node t1 = head1;
        Node t2 = head2;
        int carry = 0 ;

        Node dummy = new Node(-1);
        Node temp = dummy ;

        while(t1 != null || t2 != null){
         
          int sum = carry ;
          
          if(t1 != null){
            sum = sum +  t1.data ;
            t1 = t1.next ;
          }

          if(t2 != null){
            sum += t2.data ;
            t2 = t2.next ;
          }
          
          int digit = sum % 10 ;
          carry = sum / 10 ;

          temp.next = new Node(digit);
          temp = temp.next ;

        }

        if(carry > 0){
            temp.next = new Node(carry);
            temp = temp.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};

        Node head1 = createLL(nums1);
        Node head2 = createLL(nums2);

        Node head = addLL(head1 , head2);
        display(head);
    }
}
