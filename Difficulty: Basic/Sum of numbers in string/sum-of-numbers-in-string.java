//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();

            System.out.println(obj.findSum(s));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        // your code here
        char[] ch = s.toCharArray();
       int sum = 0;
       int number = 0;
       for(int i=0;i<ch.length;i++)
       {
           if(Character.isDigit(ch[i]))
           {
              number = number*10 + (ch[i] - '0');
           }
           else {
               sum += number;
               number = 0;
           }
       }
      sum += number;
      return sum;
    }
}