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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String strs[], int n){
        // code here
        String ans=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            while(strs[i].indexOf(ans)!=0)
            {
                ans=ans.substring(0,ans.length()-1);
                if(ans.equals(""))
                {
                    return "-1";
                }
            }
        }
        return ans;
        
    }
}