//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int a, int b, int arr1[], int arr2[]) 
    {
        // Your Code Here
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3 = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
            {
                arr3[k++] = arr1[i++];
            }
        else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n1)
        {
            arr3[k++] = arr1[i++];
        }
        while (j < n2)
        {
            arr3[k++] = arr2[j++];
        }
        
        int n=n1+n2;
        double sum=0;
        if (arr3.length%2==0)
        {
            sum=arr3[n/2]+arr3[(n/2)-1];
            sum=sum/2;
            
        }
        else
        {
            sum=arr3[(n/2)];
        }
        return sum;
    }
}