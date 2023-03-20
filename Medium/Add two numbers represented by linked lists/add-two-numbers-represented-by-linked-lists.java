//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Stack<Integer> stk1=new Stack<>();
        Node a1=first;
        while(a1!=null)
        {
            stk1.push(a1.data);
            a1=a1.next;
        }
        Stack<Integer> stk2=new Stack<>();
        Node a2=second;
        while(a2!=null)
        {
            stk2.push(a2.data);
            a2=a2.next;
        }
        
        Node dum=new Node(0);
        Node temp=dum;
        int c=0;
        while(stk1.size()>0 || stk2.size()>0)
        {
            int a=stk1.size()>0?stk1.pop():0;
            int b=stk2.size()>0?stk2.pop():0;
            int sum=a+b+c;
            c=sum/10;
            Node nn=new Node(sum%10);
            dum.next=nn;
            dum=dum.next;
            
        }
        if(c>0)
        {
           Node nn=new Node(c);
            dum.next=nn; 
        }
        Node x=temp.next;
        while(x!=null)
        {
            stk1.push(x.data);
            x=x.next;
        }
        Node y=temp.next;
        while(stk1.size()>0)
        {
            y.data=stk1.pop();
            y=y.next;
        }
        return temp.next;
    }
}