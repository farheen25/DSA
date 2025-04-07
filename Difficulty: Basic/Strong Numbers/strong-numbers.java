//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int n) {
        // code here
        int rem = 0, original=n,sum = 0;
        int result=0;
        while(n!=0){
            rem = n%10;
            result = factorial(rem);
            sum += result;
            n/=10;
        }
        if(sum == original)
        return 1;
        else
        return 0;
    }
    private static int factorial(int num){
        int prod = 1;
        if(num == 0)
        return 1;
        for(int i=num;i>=1;i--){
            prod = prod*i;
        }
        return prod;
    }
}