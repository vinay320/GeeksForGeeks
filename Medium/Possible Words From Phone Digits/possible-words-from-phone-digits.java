//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {String s="";        // your code here
        for(int i=0;i<N;i++)
        {
         s+=(a[i]-1);   
        }
        ArrayList<String> m=kpd(s);
// 	0

return m;
    }
    
    static String[] arr=new String[]{".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> kpd(String s)
	{
		if(s.length()==0)
		{
			ArrayList<String> xx=new ArrayList<>();
			xx.add("");
			return xx;
		}
		char ch=s.charAt(0);
		String subs=s.substring(1);
		ArrayList<String> l=kpd(subs);
		ArrayList<String> l2=new ArrayList<>();

		for(int i=0;i<arr[ch-'0'].length();i++)
		{
			for(String a:l)
			{
				l2.add(arr[ch-'0'].charAt(i)+a);
			}
		}

		return l2;
	}
}


