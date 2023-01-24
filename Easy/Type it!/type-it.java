//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        for(int i=s.length()/2-1;i>=0;--i)
        {
            if(s.substring(0,i+1).equals(s.substring(i+1,s.substring(0,i+1).length()+i+1)))
            {
                return s.length()-i;
            }
        }
        return s.length();
    }
}