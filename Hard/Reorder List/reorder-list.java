//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node reverse(Node head)
    {
        if(head==null)
        {
            return head;
        }
        
        Node prev=null;
        Node h=head;
        while(h!=null)
        {
            Node temp=h.next;
            h.next=prev;
            prev=h;
            h=temp;
        }
        return prev;
    }
    
    
    Node reorderlist(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node slow=head;
        Node fast=head;
        Node prevSlow=null;
        
        while(fast!=null && fast.next!=null)
        {
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node reverseHead=reverse(slow);
        prevSlow.next=null;
        
        fast=head;
        slow=reverseHead;
        
        while(fast!=null)
        {
            Node tempFast=fast.next;
            Node tempSlow=slow.next;
            fast.next=slow;
            if(tempSlow!=null && tempFast!=null)
            {
                slow.next=tempFast;
            }
            fast=tempFast;
            slow=tempSlow;
        }
        
        return head;   
    }
}
