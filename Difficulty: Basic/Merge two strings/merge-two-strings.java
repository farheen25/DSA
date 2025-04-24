//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String s1, String s2)
    { 
        // code here
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();
        while(i<s1.length() && j<s2.length())
        {
           sb.append(s1.charAt(i));
           sb.append(s2.charAt(j));
           i++;
           j++;
        }
        while(i<s1.length())
        {
           sb.append(s1.charAt(i));
           i++;
        }
        while(j<s2.length())
        {
           sb.append(s2.charAt(j));
           j++;
        }
        return sb.toString();
    }
} 