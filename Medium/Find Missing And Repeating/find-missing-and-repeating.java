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
        int xor=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        for(int i=1;i<=n;i++)
        {
            xor=xor^i;
        }


        int stbt=xor & ~(xor-1);

        int x=0;
        int y=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i] & stbt)!=0)
            {
                x=x^arr[i];
            }
            else
            {
                y=y^arr[i];
            }
        }
        for(int i=1;i<=n;i++)
        {
            if((i & stbt)!=0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
        int[] arr1=new int[2];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                arr1[0]=x;
                arr1[1]=y;
                break;
            }
            if(arr[i]==y)
            {
                arr1[0]=y;
                arr1[1]=x;
                break;
            }
        }
        
        return arr1;
    }
}