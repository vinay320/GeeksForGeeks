//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        
      
        int m=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            if(!l.contains(arr[i]))
            {
                 for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>n/k)
            {
               m++;
            }
            l.add(arr[i]);
            }
            
            
           
        }
     return m;
    }
}
