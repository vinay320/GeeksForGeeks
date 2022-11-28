//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> l=new ArrayList<>();
        if(m[0][0]==0)
        {
            return l;
        }
        
        per(0,0,m.length,m[0].length,"",l,m);
        Collections.sort(l);
        return l;
    }
    
    static void per(int a,int b,int e1,int e2,String sum,ArrayList<String> l,int[][] m)
    {
        
        if(a>=e1 || b>=e2 || a<0 || b<0 || m[a][b]==0)
        {
            return;
        }
        if(a==e1-1 && b==e2-1)
        {
            // System.out.println(sum);
            l.add(sum);
            return;
        }
        m[a][b]=0;
        per(a+1,b,e1,e2,sum+"D",l,m);
        per(a,b+1,e1,e2,sum+"R",l,m);
        per(a,b-1,e1,e2,sum+"L",l,m);
        per(a-1,b,e1,e2,sum+"U",l,m);
        m[a][b]=1;
    }
}