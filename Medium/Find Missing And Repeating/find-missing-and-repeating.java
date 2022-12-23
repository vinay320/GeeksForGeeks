//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        // Arrays.sort(arr);
        // HashMap<Integer,Integer> m=new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(m.containsKey(arr[i]))
        //     {
        //         m.put(arr[i],m.get(arr[i])+1);
        //     }
        //     else
        //     {
        //         m.put(arr[i],1);
        //     }
        // }
        // int[] ans=new int[2];
        // for(int i=0;i<n;i++)
        // {
        //     if(m.get(arr[i])==2)
        //     {
        //         ans[0]=arr[i];
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //  if((arr[i]!=(i+1)))
        //  {
        //      ans[1]=i+1;
        //      break;
        //  }
        // }
        
        // return ans;
        int[] freq=new int[1000000];
        
        int ans[]=new int[2];
        for(int i=0;i<n;i++) 
            freq[arr[i]]++;
        for(int i=1;i<=n;i++){
            if(freq[i]==0) 
                ans[1]=i;
            if(freq[i]>1) 
                ans[0]=i;
    }
    return ans;

    }
}