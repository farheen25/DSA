//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        String result = "";
        
        for(String str : arr)
        {
            boolean allPrefixesExist = true;
            for (int i = 1; i < str.length(); i++) {
            if(!set.contains(str.substring(0, i)))
            {
                allPrefixesExist = false;
                break;
            }
            }
            
            if(allPrefixesExist)
            {
                if(str.length()>result.length() || (str.length() == result.length() && str.compareTo(result)<0)){
                    result = str;
                }
            }
        }
        return result;
        
    }
}
        
