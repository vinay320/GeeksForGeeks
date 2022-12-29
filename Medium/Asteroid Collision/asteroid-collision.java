//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(i<N){
            if(asteroids[i]<0){
                if(st.isEmpty() || st.peek()<0)
                    st.push(asteroids[i]);
                else if(st.peek()>0){
                    int a = st.pop();
                    if(a>Math.abs(asteroids[i]))
                        st.push(a);
                    else if(a<Math.abs(asteroids[i]))
                        continue;
                }   
            }
            else
                st.push(asteroids[i]);
            i++;    
        }
        
        int ans[] = new int[st.size()];
        i=st.size()-1;
        while(!st.isEmpty()){
            ans[i--] = st.pop();
        }
        
        return ans;
    }
}
