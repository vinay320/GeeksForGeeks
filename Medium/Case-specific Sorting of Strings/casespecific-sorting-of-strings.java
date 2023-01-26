//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    public static String caseSort(String str) 
    {
        char[] OArr = str.toCharArray();
        
        int lIdx = 0;
        int uIdx = 0;
        
        for (char ch: OArr) 
        {
            if (Character.isUpperCase(ch))
                uIdx++;
            else
                lIdx++;
        }
        
        int upperSize = uIdx;
        int lowerSize = lIdx;
        
        char[] lca = new char[lowerSize];
        char[] uca = new char[upperSize];
        
        lIdx = 0;
        uIdx = 0;
        
        for (char ch: OArr) 
        {
            if (Character.isUpperCase(ch))
                uca[uIdx++] = ch;
            else
                lca[lIdx++] = ch;
        };

        Arrays.sort(uca);
        Arrays.sort(lca);
        
        lIdx = 0;
        uIdx = 0;
        
        for (int mIdx = 0; mIdx < OArr.length; mIdx++) 
        {
            if (Character.isUpperCase(OArr[mIdx])) 
            {
                OArr[mIdx] = uca[uIdx++];
            }
            else
            {
                OArr[mIdx] = lca[lIdx++];
            }
        }
        String rtnStr = new String(OArr);
        return rtnStr;
    }
    
}


//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends