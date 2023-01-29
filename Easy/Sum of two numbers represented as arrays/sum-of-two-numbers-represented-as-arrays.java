//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        int[] arr=new int[Math.max(a.length,b.length)];
        int k=arr.length-1;
        int c=0;
        for(int i=a.length-1,j=b.length-1;i>=0 || j>=0;i--,j--)
        {
            if(i<0)
            {
                arr[k]=b[j]+c;
            }
            else if(j<0)
            {
                arr[k]=a[i]+c;
            }
            else
            {
                arr[k]=a[i]+b[j]+c;
            }
            c=arr[k]/10;
            if(arr[k]>9)
            {
                arr[k]=arr[k]%10;
            }
            k--;
        }
        
        ArrayList<Integer> l=new ArrayList<>();
        if(c>0)
        {
            l.add(c);
        }
        
        for(int x:arr)
        {
            l.add(x);
        }
        
        return l;
    }
}