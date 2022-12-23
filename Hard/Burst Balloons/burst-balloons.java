//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int N, int[] nums) {
    // code here
     int l = nums.length;   
     int[] arr = new int[l+2];
        
     arr[0]=arr[l+1]=1;

     for(int i=0; i<nums.length; i++)
     {
         arr[i+1]=nums[i];

     }
 
    int [][] dp =new int [l+2][l+2];

    for(int i=l; i>=1; i--)
    {

        for(int j=1; j<=l; j++)
        {
            if(i>j)continue;
            int max=(int)-1e9;
            
            for(int k=i; k<=j; k++)
            {
            int cost = (arr[i-1]*arr[k]*arr[j+1])+dp[i][k-1]+dp[k+1][j];
            max=Math.max(max,cost);
        }

            dp[i][j]=max;

  }
    }
        return dp [1][l];

  }
}
     