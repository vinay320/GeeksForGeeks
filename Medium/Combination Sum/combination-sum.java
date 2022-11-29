//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();
        HashSet<Integer> h=new HashSet<>(A);
        A.clear();
        A.addAll(h);
        Collections.sort(A);
        com(0,B,l,l2,A);
        
        return l;
        
    }
    static void com(int idx,int sum,ArrayList<ArrayList<Integer>> l ,ArrayList<Integer> l2,ArrayList<Integer> A) 
    {
        if(sum==0)
        {
            Collections.sort(l2);
            if(!l.contains(l2))
            {
                 l.add(new ArrayList<>(l2));
            }
            return;
        }
        if(idx==A.size())
        {
            return;
        }
        for(int i=idx;i<A.size();i++)
        {
        if(sum-A.get(idx)>=0)
        {
            l2.add(A.get(i));
            com(i,sum-A.get(i),l,l2,A);
            l2.remove(A.get(i));
         }
        }
        // if(idx+1<A.size())
        // {
        //     com(idx+1,sum,l,l2,A);
        // }
       
    }
}



