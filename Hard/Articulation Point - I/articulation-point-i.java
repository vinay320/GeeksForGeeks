//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    int time= 0;
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] checked= new boolean[V];
        boolean[] ap= new boolean[V];
        int[] disc= new int[V];
        int[] low= new int[V];
        int[] par= new int[V];
        Arrays.fill(par, -1);
        for(int i=0; i<V; i++){
            if(!checked[i]){
                dfs(adj, i, disc, low, par, ap, checked);
            }
        }
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<V; i++){
            if(ap[i]){
                al.add(i);
            }
        }
        if(al.size()==0){
            al.add(-1);
        }
        return al;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> adj, int u, int[] disc, int[] low, int[] par, boolean[] ap, boolean[] checked){
        checked[u]= true;
        disc[u]= low[u]= ++time;
        int child=0;
        for(int v: adj.get(u)){
            if(!checked[v]){
                child++;
                par[v]= u;
                dfs(adj, v, disc, low, par, ap, checked);
                low[u]= Math.min(low[u], low[v]);
                if(par[u]==-1 && child>1){
                    ap[u]= true;
                }
                if(par[u]!=-1 && low[v]>= disc[u]){
                    ap[u]= true;
                }
            } else if (v!= par[u]){
                low[u]= Math.min(low[u], disc[v]);
            }
        }
    }
}