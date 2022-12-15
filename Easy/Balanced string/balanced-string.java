//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int N) {
        // code here
        String s="abcdefghijklmnopqrstuvwxyz";
        String t="";
        int x=N,sum=0,i;
        if(N>26) 
        {
            while(N>26) 
            {
                t+=s; 
                N-=26;
                
            }
        }
        if(N%2==0) 
        {
            for(i=0;i<N/2;i++) 
                t+=s.charAt(i);
            for(i=26-N/2;i<26;i++) 
                t+=s.charAt(i);
            return t;
        }
            while(x>0) 
            {
                sum+=x%10; 
                 x/=10;
                
            }
            if(sum%2==0) 
            {
                for(i=0;i<=N/2;i++) 
                    t+=s.charAt(i);
                for(i=26-N/2;i<26;i++) 
                    t+=s.charAt(i);
            }
            else {
                for(i=0;i<N/2;i++) 
                    t+=s.charAt(i);
                for(i=25-N/2;i<26;i++) 
                    t+=s.charAt(i);
            }
            return t;
    }
}