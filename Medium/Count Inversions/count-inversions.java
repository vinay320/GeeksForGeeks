//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long inver=0;
        
        int n = (int)N-1;
        inver=mergeSort(arr,0,n);
        return inver;
        
    }
    
    static long mergeSort(long arr[], int si, int ei)
    {
        long inv=0;
        if(si>=ei) return 0;
        int mid=si+(ei-si)/2;
        inv+=mergeSort(arr,si,mid);
        inv+=mergeSort(arr,mid+1,ei);
        inv+=conqure(arr,si,mid,ei);
        return inv;
    }
    static long conqure(long arr[], int si, int mid, int ei)
    {
        long inv=0;
        long merged[]=new long[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<= mid && idx2<=ei ){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
                inv+=(mid+1-idx1);
            }
        }
        
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i =0, j=si;i<merged.length;i++){
            arr[j++]=merged[i];
        }
        return inv;
        
    }
}