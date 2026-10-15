class Solution {
        int prefix[];
        int total = 0;
    public Solution(int[] w) {
        prefix =  new int[w.length];
        int sum = 0 ;
        for(int i=0;i<w.length;i++)
        {
            sum+=w[i];
            prefix[i] = sum;
        }
        total = sum;
    }
    
    public int pickIndex() {
        int target = (int)(Math.random()*total)+1;
        int low = 0;
        int high = prefix.length-1;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(prefix[mid]>=target)
            {
                high = mid;
            } else{
                low = mid+1;
            }
        }
        return high;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */