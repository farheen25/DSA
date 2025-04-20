//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str1 = read.readLine();
            String str2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(str1, str2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static String removeChars(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            int flag = 0;
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    flag = 1;
                }
            }
            if(flag != 1)
            {
             sb.append(s1.charAt(i));   
            }
        }
        return sb.toString();
    }
}