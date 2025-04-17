//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String s, int n)
    {
        // your code here
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) continue;
            char a = s.charAt(i);
            if(map.containsKey(a))
            {
                map.put(a, map.get(a) + 1);
            }
            else{
                map.put(a, 1);
            }
        }
        for(Map.Entry<Character, Integer> freq : map.entrySet())
        {
            if(freq.getValue() == n)
            {
                count++;
            }
        }
        return count;
    }
}