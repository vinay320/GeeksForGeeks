//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int n, int K) {
        // code here
        int l=0,r=0;
        for(int it=0;it<n;it++)
        {
            l=Math.max(arr[it],l);
            r+=arr[it];
        }
        while(l<=r)
        {
            int mid=(l+r)/2;
            int count=0,sum=0;
            for(int i=0;i<n;i++)
            {
                if(sum+arr[i]>mid)
                {
                    sum=0;
                    count++;
                }
                sum+=arr[i];
                if(count>K)
                break;
            }
            if(count<K)
            r=mid-1;
            else
            l=mid+1;
        }
        return l;
    }
};