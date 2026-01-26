class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0)
                result.add(idx+1);
            else
            nums[idx] = -Math.abs(nums[idx]);
        }
        return result;
    }
}