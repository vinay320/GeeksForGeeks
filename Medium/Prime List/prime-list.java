//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
    Node primeList(Node head){
        Node temp=new Node(0);
        Node dum=temp;
        
        while(head!=null)
        {
            if(isPrime(head.val))
            {
                Node nn=new Node(0);
                nn.val=head.val;
                if(head.val<=2)
                {
                    nn.val=2;
                }
                temp.next=nn;
                temp=temp.next;
            }
            else
            {
                int x1=head.val;
                int c1=0;
                while(!isPrime(x1))
                {
                    x1--;
                    c1++;
                }
                
                int x2=head.val;
                int c2=0;
                while(!isPrime(x2))
                {
                    x2++;
                    c2++;
                }
                
                
                Node nn=new Node(0);
                
                nn.val=c1<=c2?x1:x2;
                
                temp.next=nn;
                temp=temp.next;
            }
            head=head.next;
        }
        
        return dum.next;
        
    }
    
    static boolean isPrime(int num)
    {
        
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}