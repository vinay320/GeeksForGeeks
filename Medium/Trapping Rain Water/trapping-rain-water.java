//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        long[] a=new long[n];
        long[] b=new long[n];
        a[0]=arr[0];
        b[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        {
            a[i]=Math.max(a[i-1],arr[i]);
            // 3 3 3 3 3 4
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            b[i]=Math.max(b[i+1],arr[i]);
            // 4 4 4 4 4 4
        }
        
        
        long sum=0;
        for(int i=arr.length-2;i>0;i--)
        {
              
            sum+=Math.min(a[i],b[i])-arr[i];
        }
        
        return sum;
    } 
}


