//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
     long x=0;
    public void toh1(int N, int a, int c, int b ) {
        // Your code here
        if(N==0)
        {
            return; 
        }
        toh1(N-1,a,b,c);
        System.out.println("move disk "+N+" from rod "+a+" to rod "+c);
        toh1(N-1,b,c,a);
        x++;
    }
    public long toh(int N, int from, int to, int aux) {
    
        toh1(N,from,to,aux);
        return x;
    }
    
}
