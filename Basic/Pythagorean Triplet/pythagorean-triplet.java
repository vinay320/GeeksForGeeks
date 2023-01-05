//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        for(int i=0;i<n;i++){
	        arr[i]*=arr[i];
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<n-2;i++){
	        for(int j=i+1;j<n-1;j++){
	            int sum = arr[i] + arr[j];
	            for(int k=0;k<n;k++){
	                if(sum==arr[k]){
	                return true;
	            }
	        }
	        }
	    }
	    return false;
    }
    
}