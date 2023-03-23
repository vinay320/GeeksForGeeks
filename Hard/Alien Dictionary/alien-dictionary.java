//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        HashMap<Character,List<Character>> mp=new HashMap<>();
        for(int i=0;i<dict.length;i++)
        {
            String s=dict[i];
            for(int j=0;j<s.length();j++)
            {
                if(!mp.containsKey(s.charAt(j)))
                {
                    mp.put(s.charAt(j),new ArrayList<>());
                }
            }
        }
        
        for(int i=0;i<dict.length-1;i++)
        {
            String s1=dict[i];
             String s2=dict[i+1];
             if(s1.startsWith(s2) && s1.length()>s2.length())
             {
                 return "";
             }
            for(int j=0;j<Math.min(s1.length(),s2.length());j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    mp.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }
        
       return Topological_Sort(mp); 
    }
    
    public String Topological_Sort(HashMap<Character,List<Character>> mp)
    {
        int[] in=Indegree(mp);
        Queue<Character> q=new LinkedList<>();
        
        StringBuilder s=new StringBuilder();
        for(char ch:mp.keySet())
        {
            if(in[ch-'a']==0)
            {
                q.add(ch);
            }
        }
        int count=0;
        while(!q.isEmpty())
        {
            char rv=q.poll();
            count++;
            s.append(rv);
            for(char nbrs:mp.get(rv))
            {
                in[nbrs-'a']--;
                if(in[nbrs-'a']==0)
                {
                    q.add(nbrs);
                }
            }
        }
        
        return count==mp.size()?s.toString():"";
    }
    public int[] Indegree(HashMap<Character,List<Character>> mp)
    {
            // in this we will increse the value of nber value by one while traversing all values
            int[] In=new int[26];
            for(char key:mp.keySet())
            {
                for(char nbrs:mp.get(key))
                {
                    In[nbrs-'a']++;
                }
            }
            return In;
    }
}