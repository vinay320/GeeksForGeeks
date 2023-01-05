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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().printUnsorted(arr, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] printUnsorted(int[] nums, int n) {
        // code here
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int start = arr.length-1, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if(end - start >= 0)
        {
            return new int[]{start,end};
        }
        return new int[0];
    }
}