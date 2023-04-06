//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        int[] arr=new int[size];
        Arrays.fill(arr,1);
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(a[i]>a[j])
                {
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
                
    
            }
            
        }
        
        for(int i:arr)
        {
            max=Math.max(max,i);
        }
        return max;
    }
} 