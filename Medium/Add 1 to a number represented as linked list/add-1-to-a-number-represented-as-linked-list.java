//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        
        Stack<Integer> st=new Stack<>();
        
        Node curr=head;
        while(curr!=null)
        {
            st.push(curr.data);
            curr=curr.next;
        }
        
        int c=1;
        Node tp=new Node(0);
        Node dm=tp;
        while(!st.isEmpty())
        {
            int x=st.pop()+c;
            
            Node nn=new Node(x%10);
            c=x/10;
            tp.next=nn;
            tp=tp.next;
        }
        
        if(c>0)
        {
            Node nn=new Node(c);
            tp.next=nn;
            tp=tp.next;
        }
        
        Node curr2=dm.next;
        while(curr2!=null)
        {
            st.push(curr2.data);
            curr2=curr2.next;
        }
        
        Node curr3=dm.next;
        while(!st.isEmpty())
        {
            curr3.data=st.pop();
            curr3=curr3.next;
        }
        
        return dm.next;
    }
}
