//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            if(ans.length() == 0)
                System.out.println();
            else
                System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String rremove(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        int n = s.length();

        int i = 0;
        while (i < n) {
            char c = s.charAt(i);
            int freq = 0;
            while (i < n && s.charAt(i) == c) {
                freq++;
                i++;
            }

            if (freq == 1)
                res.append(c);
        }

        String result = res.toString();
        if (result.equals(s))
            return result;
        return rremove(result);
    }
}
