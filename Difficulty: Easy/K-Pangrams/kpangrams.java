//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        str=str.replace(" ","");
        if(str.length()<26){
            return false;
        }
        
         boolean[] arr = new boolean[26];
         int chars=0;
   for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
       if (c >= 'a' && c <= 'z') {
                if (!arr[c - 'a']) {
                    arr[c - 'a'] = true;
                    chars++;
                }
            }

       
   }
    
    
    
    int required=26-chars;
    return k>=required;
        
    }
}