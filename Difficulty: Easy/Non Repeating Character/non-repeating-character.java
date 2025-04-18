//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        char[] ch = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c: ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> freq : map.entrySet())
        {
            if(freq.getValue() == 1) {
                return freq.getKey();
                
            }
        }
        return '$';
    }
}
