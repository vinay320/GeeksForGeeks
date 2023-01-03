//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            out.println(ob.removeStudents(H,N));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 

{

    public int removeStudents(int[] H, int N) 

    {

     List<Integer> al=new ArrayList<>();

     al.add(H[0]);

     

     for(int i=1;i<N;i++)

     {

         if(al.contains(H[i]))

         continue;

         

         if(H[i]>al.get(al.size()-1))

         {

             al.add(H[i]);

         }

         else

         {

             int idx=search(0,al.size(),H[i],al);

             al.set(idx,H[i]);

         }

     }

     return N-al.size();

     

    }

    public static int search(int low,int high,int num,List<Integer> al)

    {

        

        while(low<=high)

        {

            int mid=low+(high-low)/2;

            

            if(al.get(mid)>num)

            {

                high=mid-1;

            }

            else 

            {

                low=mid+1;

            }

        }

        return low;

    }

    

}