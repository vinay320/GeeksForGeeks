//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {   sum+=a[i];
                l.add(a[i]);
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                    ans.clear();
                    ans.addAll(l);
                }
                sum=0;
                l.clear();
            }
        }
        if(ans.size()==0 || sum>max)
        {
            if(l.size()==0)
            {
                l.add(-1);
                return l;
            }
            else
            {
                return l;
            }
        }
        return ans;
    }
}