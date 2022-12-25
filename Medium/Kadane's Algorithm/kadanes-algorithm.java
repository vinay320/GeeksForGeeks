//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max1=arr[0];
        int c=0;
        for(int i=0;i<n;i++)
        {   if(arr[i]<0)
            {
                c++;
            }
        }
            if(c==n)
            {
                for(int i=1;i<n;i++)
                {
                    if(arr[i]>max1)
                    {
                        max1=arr[i];
                    }
                }
            }
        
        
        int sum=0;
        int maxm=0;
        for(int i=0;i<n;i++)
         {
             sum=sum+arr[i];
             sum=Integer.max(sum,0);
             maxm=Integer.max(maxm,sum);
             
         }
         
        if(sum==0 && c==n)
        {
            return max1;
        }
        return maxm;
        
        
    }
    
}

