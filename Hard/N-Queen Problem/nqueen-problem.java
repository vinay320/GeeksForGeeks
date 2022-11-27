//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> l;
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        l=new ArrayList<>();
        boolean[][] board=new boolean[n][n];
       
        N_Queen(board,n,0);
        return l;
    }
    
    
    public static void Display(boolean[][] board) {
	
	ArrayList<Integer> ans=new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][i]==true)
				{
				    ans.add(j+1);
				}
			}
		    

		}
		if(!l.contains(ans))
		{
		l.add(ans);    
		}
        
		

	}
    static void N_Queen(boolean[][] board,int tq,int col)
    {
        if(tq==col)
        {   
            Display(board);
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(safe(board,row,col))
            {
            board[row][col]=true;
            N_Queen(board,tq,col+1);
            board[row][col]=false;    
            }
            
        }
    }
    
    static boolean safe(boolean[][] board,int row,int col)
    {
        int r=row;
        int c=col;
        while(c>=0)
        {
            if(board[row][c]==true)
            {
                return false;
            }
            c--;
        }
        
        c=col;
        r=row;
        while(r>=0 && c>=0)
        {
            if(board[r][c]==true)
            {
                return false;
            }
            r--;
            c--;
        }
        
        r=row;
        c=col;
        while(c>=0 && r<board.length)
        {
            if(board[r][c]==true)
            {
                return false;
            }
            r++;
            c--;
        }
        
        return true;
    }
}