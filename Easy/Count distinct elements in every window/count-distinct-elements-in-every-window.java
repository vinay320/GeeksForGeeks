//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        int c=0;
        ArrayList<Integer> l=new ArrayList<>();
        l.add(m.size());
        for(int i=k;i<n;i++)
        {
            m.put(arr[c],m.get(arr[c])-1);
            if(m.get(arr[c])==0)
            {
                m.remove(arr[c]);
            }            
            c++;
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            l.add(m.size());
        }
        
        return l;
    }
}

