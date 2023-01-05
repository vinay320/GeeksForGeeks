//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
       Stack<Node> st=new Stack<>();
        Node dumm=new Node(0);
        Node tmp=dumm;
        Node start=null;
        
        while(node!=null)
        {
            if(st.size()==0)
            {
                start=node;
            }
            st.push(node);
            if(st.size()==k)
            {
                while(!st.empty())
                {
                    Node nn=new Node(st.pop().data);
                    dumm.next=nn;
                    dumm=dumm.next;
                }
            }
            node=node.next;
        }
        
        if(st.size()>0)
        {
            while(!st.empty())
                {
                    Node nn=new Node(st.pop().data);
                    dumm.next=nn;
                    dumm=dumm.next;
                }
        }
        
        return tmp.next;
    }
}

