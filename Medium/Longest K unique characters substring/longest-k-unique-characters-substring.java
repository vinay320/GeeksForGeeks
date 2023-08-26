//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> mp=new HashMap<>();
        int st=0;
        int e=0;
        int ans=-1;
        while(e<s.length())
        {
            if(mp.size()<=k)
            {
                mp.put(s.charAt(e),mp.getOrDefault(s.charAt(e),0)+1);
                e++;
            }
            
            while(mp.size()>k)
            {
                if(mp.get(s.charAt(st))>1)
                {
                    mp.put(s.charAt(st),mp.getOrDefault(s.charAt(st),0)-1);
                }
                else
                {
                    mp.remove(s.charAt(st));
                }
                st++;
            }
            ans=Math.max(ans,e-st);
            
        }
        
        if(mp.size()<k)
        {
            return -1;
        }
        
        return ans;
    }
}