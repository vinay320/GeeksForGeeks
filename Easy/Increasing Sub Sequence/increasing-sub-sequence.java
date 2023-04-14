//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<S.length();i++)
        {
            l.add((int)(S.charAt(i)-'a'));
        }
        
        if(l.size()==0)
        {
            return 0;
        }
        int[] arr=new int[l.size()];
        arr[0]=1;
        int ans=1;
        for(int i=0;i<l.size();i++)
        {
            int m=0;
            for(int j=0;j<i;j++)
            {
               if(l.get(i)>l.get(j))
               {
                    m=Math.max(m,arr[j]);
               }
            }
        
        arr[i]=m+1;
        ans=Math.max(arr[i],ans);
        }
        return ans;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}


// } Driver Code Ends