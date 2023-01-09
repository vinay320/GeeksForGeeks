//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        
        // code here 
        ArrayList<Integer> l=new ArrayList<>();
        int minrow=0;
        int mincol=0;
        int maxcol=c-1;
        int maxrow=r-1;
        
        int tne=c*r;
        int count=0;
        
        while(count<tne)
        {
            for(int i=mincol;i<=maxcol;i++)
            {
                if(count<tne)
                {
                    l.add(arr[minrow][i]);
                count++;
                }
            }
            minrow++;
            for(int i=minrow;i<=maxrow;i++)
            {
               if(count<tne)
               {
                    l.add(arr[i][maxcol]);
                count++;
               }
            }
            maxcol--;
            for(int i=maxcol;i>=mincol;i--)
            {
               if(count<tne)
               {
                    l.add(arr[maxrow][i]);
                count++;
               }
            }
            maxrow--;
            for(int i=maxrow;i>=minrow;i--)
            {
                if(count<tne)
                {
                    l.add(arr[i][mincol]);
                count++;
                }
            }
            mincol++;
        }
        return l;
    }
}
