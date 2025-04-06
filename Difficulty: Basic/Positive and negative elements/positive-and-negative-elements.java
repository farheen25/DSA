//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();

            v = new Solution().arranged(array1);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> neg = new ArrayList<Integer>();
        for(int i : arr) {
            if(i >= 0) {
                pos.add(i);
            }
            else
            {
                neg.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i<pos.size() && j<neg.size())
        {
            result.add(pos.get(i++));
            result.add(neg.get(j++));
        }
        return result;
    }
}
