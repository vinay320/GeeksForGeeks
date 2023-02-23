//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int check(char ch)
    {
        if(ch=='^')
        {
            return 3;
        }
        else if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        return -1;
    }
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> stk=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<exp.length();i++)
        {
            char ch=exp.charAt(i);
            if(ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                str.append(ch);
            }
            else if(ch=='(')
            {
                stk.push(ch);
            }
            else if(ch==')')
            {
                while(!stk.isEmpty() && stk.peek()!='(' )
                {
                    str.append(stk.pop());
                }
                stk.pop();
            }
            else
            {
                while(!stk.isEmpty() && check(ch)<=check(stk.peek()))
                {
                    str.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        
        while(!stk.isEmpty())
        {
            str.append(stk.pop());
        }
        
        return str.toString();
    }
}