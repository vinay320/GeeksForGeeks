//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Stack<Integer> s=new Stack<>();
        Node curr =head;
        while(curr!=null)
        {
            if(s.size()>0)
            {
                while(s.size()>0 && s.peek()<curr.data)
                {
                    s.pop();
                }
                
            }
            s.push(curr.data);
            curr=curr.next;
        }
        
        Stack<Integer> s1=new Stack<>();
        while(s.size()>0)
        {
            s1.push(s.pop());
        }
        
        Node curr2=head;
        Node ans=curr2;
        while(s1.size()>0)
        {
           // System.out.println(s1.pop());
            curr2.data=s1.pop();
            if(s1.size()==0)
            {
                break;
            }
            curr2=curr2.next;
        }
        curr2.next=null;
        return ans;
    }
}
  