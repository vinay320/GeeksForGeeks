//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        // Your code here
        int ans=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            ans+=arr[i];
            if(ans==0)
            {
                max=i+1;
            }
            else
            {
                if(mp.containsKey(ans))
                {
                    max=Math.max(max,i-mp.get(ans));
                }
                else
                {
                    mp.put(ans,i);
                }
            }
        }
        
        return max;
    }
}