//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
    
        int count=0;
        int curr=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,i+arr[i]);
            if(curr>=arr.length-1)
            {
                break;
            }
            else if(max<=i)
            {
                return -1;
            }
            else if(i==curr)
            {
                curr=max;
                count++;
            }
            
        }
        
        return count;
    
}
}