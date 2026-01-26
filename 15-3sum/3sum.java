class Solution {
    List<List<Integer>> al = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            twoSum(i+1,nums.length-1,nums,nums[i]);

        }
        return al;
    }

    public void twoSum(int left, int right, int[] nums, int target)
    {
        while(left<right)
        {
        int sum = target+nums[left]+nums[right];
        if(sum==0)
        {
            al.add(Arrays.asList(target, nums[left], nums[right]));
            while(left<right && nums[left] == nums[left+1]) left++;
            while(left<right && nums[right] == nums[right-1]) right--;
            left++;
            right--;

        }
        else if(sum<0)
        {
            left++;
        }
        else{
            right--;
        }
    }
    }
}