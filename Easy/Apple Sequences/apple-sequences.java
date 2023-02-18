//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int si=0;
        int ei=0;
        int max=0;
        int i=0;
        while(ei<n)
        {
            if(arr.charAt(ei)=='O')
            {
                i++;
            }
           
                while(i>m && si<=ei)
                {
                    max=Math.max(max,ei-si);
                    if(arr.charAt(si)=='O')
                    {
                        i--;
                    }
                    si++;
                }
            max=Math.max(max,ei-si+1);
            ei++;
        }
        
        return max;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends