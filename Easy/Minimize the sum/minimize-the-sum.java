//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int i=0;i<N;i++)
        {
            pQueue.add(arr[i]);
        }
        int val=0;
        int x=0;
        while(pQueue.size()!=1)
        {
        //   int sum=;
        //   int ans=; 
           val=pQueue.poll()+pQueue.poll();
           pQueue.add(val);
           x+=val;       
        }
        
        return x;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends