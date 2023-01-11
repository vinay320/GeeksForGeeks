//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String text1, String text2)
    {
        // your code here
        int[][] arr=new int[text1.length()+1][text2.length()+1];
        
        for(int i=0;i<text2.length()+1;i++)
        {
            arr[0][i]=0;
        }
        for(int i=0;i<text1.length()+1;i++)
        {
            arr[i][0]=0;
        }
        
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else
                {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        
        
        return arr[text1.length()][text2.length()];
    }
    
}