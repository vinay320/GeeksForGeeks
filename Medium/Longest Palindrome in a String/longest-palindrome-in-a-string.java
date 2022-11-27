//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
       if(S.length()==1)return S;

        int start=0;

        int maxlength=1;

        for(int i=1; i<S.length(); i++)

        {

            //for even;

            int l=i-1;

            int r=i;

            while(l>=0 && r<S.length() && S.charAt(l)==S.charAt(r))

            {

                if(r-l+1 >maxlength)

                {

                    maxlength=r-l+1;

                    start=l;

                }

                l--;

                r++;

            }

            l=i-1;

            r=i+1;

            while(l>=0 && r<S.length() && S.charAt(l)==S.charAt(r))

            {

                if(r-l+1 >maxlength)

                {

                    maxlength=r-l+1;

                    start=l;

                }

                l--;

                r++;

            }

        }

        

        return S.substring(start,maxlength+start); 
    }
}