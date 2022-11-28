//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    
    //add code here
    return solve(n,"");
    }
    
    static int solve(int n,String ans)
    {
        int val=n%10;
        if(n==0)
        {
            return Integer.parseInt(ans);
        }
        
        if(val==0)
        {
            ans="5"+ans;
        }
        else
        {
            ans=val+ans;
        }
        
        return solve(n/10,ans);
        
        
    }
    
}