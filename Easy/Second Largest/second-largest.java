//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
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

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i=0;i<n;i++)
        // {
        //     pq.offer(arr[i]);
        //     if(pq.size()==3)
        //     {
        //         pq.poll();
        //     }
        // }
        // return pq.poll();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            if (!pq.contains(num)) {
                pq.offer(num);
                if (pq.size() > 2) {
                    pq.poll();
                }
            }
        }

        // At this point, the heap will have at most 2 unique elements
        int firstLargest = pq.poll();
        if(pq.size()==0)
        {
            return -1;
        }
        int secondLargest = pq.poll();

        return firstLargest;
    }
}