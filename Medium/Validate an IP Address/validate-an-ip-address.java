//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String IP) {
        // Write your code here
        int c1=0;
        for(int i=0;i<IP.length();i++)
        {
            if(IP.charAt(i)=='.')
            {
                c1++;
            }
        }
        
        if(c1==3)
        {
            String arr="";
        
            for(int i=0;i<IP.length();i++)
            {
                
                if(IP.charAt(i)=='.')
                {   
                    if(arr.length()==0 || arr.length()>3)
                    {
                        return false;
                    }
                    int x=Integer.parseInt(arr);
                
                    if( x>255 || !arr.equals(x+""))
                    {
                        return false;
                    }
                    else
                    {
                        arr="";
                    }
                }
                else if(IP.charAt(i)>='0' && IP.charAt(i)<='9')
                {
                    arr+=IP.charAt(i);
                }
                else
                {
                    return false;
                }
                
                
                
            }
                    if(arr.length()==0 || arr.length()>3)
                    {
                        return false;
                    }
                    int x=Integer.parseInt(arr);
                
                    if( x>255 || !arr.equals(x+""))
                    {
                        return false;
                    }
                    else
                    {
                        
                        arr="";
                    }
            return true;
        }
        
        
        
            return false;
        
    }
}