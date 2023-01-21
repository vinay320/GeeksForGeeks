//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
     int a1=Integer.bitCount(b);
     int b1=Integer.bitCount(a);
     
     int val=0;
     
     for(int i=0;i<=31;i++)
     {
         int x1=1<<i;
         int set=a&x1;
         
         if(set==0 && a1>b1)
         {
             val|=x1;
             a1--;
         }
         else if(set!=0 && b1>a1)
         {
             b1--;
         }
         else
         {
             val|=set;
         }
     }
     return val;
    }
    
}