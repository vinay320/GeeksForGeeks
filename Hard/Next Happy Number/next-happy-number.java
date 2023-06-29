//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int N){
        // code here
        N++;
        while(N<100005)
        {
            if(isHappy(N))
            {
                return N;
            }
            N++;
        }
        return 0;
        
    }
    public static boolean isHappy(int n) {
    
        List<Integer> l=new ArrayList<>();
        if(n==1)
        {
            return true;
        }
       while(n>1)
       {
           int sum=0;
           while(n>0)
           {
               int r=n%10;
               sum+=r*r;
               n=n/10;
           }
        if(l.contains(sum))
        {
            return false;
        }
           else
           {
               l.add(sum);
           }
       
        if(sum==1)
        {
            return true;
        }
        else
        {
            n=sum;
        }
       }
        
        return false;
    }
}