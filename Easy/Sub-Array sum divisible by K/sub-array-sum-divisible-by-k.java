//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    long subCount(long arr[] ,int n,int k)
    {
     
     
     long sum=0;
     int count=0;
     HashMap<Long,Long> m=new HashMap<>();
     
     m.put(sum,1L);
     long rem=0;
     for(int i=0;i<arr.length;i++)
     {
         sum+=arr[i];
         rem=sum%k;
         
         if(rem<0)
         {
             rem+=k;
         }
         
         if(m.containsKey(rem))
         {
             count+=m.get(rem);
             m.put(rem,m.get(rem)+1);
         }
         else
         {
            m.put(rem,1L);
         }
     }
     return count;
        
        
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
    //        int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.subCount(a,n,k);
            System.out.println(ans);
        }
    }
}






// } Driver Code Ends