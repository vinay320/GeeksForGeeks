//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
        String x="";
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
                if(l.size()>0 && l.get(l.size()-1)==s.charAt(i))
                {
                    l.remove(l.size()-1);
                }
                else
                {
                    l.add(s.charAt(i));
                }
                
            
        }
        for(int i=0;i<l.size();i++)
        {
            x+=l.get(i);
        }
        if(x.length()==0)
        {
            return "-1";
        }
        return x;
    }
}
        
      
