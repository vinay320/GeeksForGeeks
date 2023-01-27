//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        // code here
        char[] arr=str.toCharArray();
        if(arr[0]=='0')
        {
            return 0;
        }
        int n=arr.length;
        int[] curr=new int[n+1];
        
        curr[0]=1;
        curr[1]=1;
        for(int i=2;i<=n;i++)
        {
            if(arr[i-1]>'0')
            {
                curr[i]=curr[i-1];
            }
            if(arr[i-2]=='1' || (arr[i-2]=='2' && arr[i-1]<'7'))
            {
                curr[i]=(curr[i]+curr[i-2])%1000000007;
            }
        }
        return curr[n];
    }
}