//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String str = br.readLine().trim();

            Vector<Integer> ans = new Solve().findRange(str, n);
            if (ans.size() == 1) {
                System.out.println(ans.get(0));
            } else {
                System.out.println(ans.get(0) + " " + ans.get(1));
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) {
        // code here
        int currsum = 0;
        int totalsum = 0;
        
        int start = -1;
        int end = -1;
        
        int s = 0;
        
        for(int i=0; i<n;i++){
            int val = str.charAt(i) - '0';
            
            if(val==1){
                
                val = -1;
            }
            else{
                val = 1;
            }
            
            currsum = Math.max(currsum +val, val);
            
            if(totalsum<currsum){
                start = s;
                end = i;
                totalsum = currsum;
            }
            
            if(currsum<0){
                currsum = 0;
                s = i+1;
            }
            
        }
        
        Vector<Integer> ans = new Vector<>();
        if(start==-1){
            ans.add(-1);
        }
        else{
            ans.add(start+1);
            ans.add(end+1);
        }
        return ans;
    }
}