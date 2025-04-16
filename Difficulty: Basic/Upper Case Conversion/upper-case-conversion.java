//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.convert(str));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
       String[] words = s.split(" ");
       StringBuilder sb = new StringBuilder();
       
       for(String word : words){
           sb.append(Character.toUpperCase(word.charAt(0)));
           sb.append(word.substring(1));
           sb.append(" ");
       }
       return sb.toString();
    }
}