//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(A1[j]==A2[i])
                {
                    l.add(A1[j]);
                }
            }
        }
        
        ArrayList<Integer> l2=new ArrayList<>();
        
        for(int i=0;i<N;i++)
        {
            if(!l.contains(A1[i]))
            {
                l2.add(A1[i]);
            }
        }
        
        Collections.sort(l2);
        
        for(int i=0;i<l2.size();i++)
        {
            l.add(l2.get(i));
        }
        
        int[] ans=new int[l.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=l.get(i);
        }
        return ans;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends