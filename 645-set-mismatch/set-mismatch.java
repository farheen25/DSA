class Solution {
    public int[] findErrorNums(int[] nums) {
        int index=0, duplicate=-1, miss=-1;
        for(int i=0;i<nums.length;i++)
        {
            index = Math.abs(nums[i])-1;
            if(nums[index]<0) 
            {
                duplicate = Math.abs(nums[i]);
            }
            else {
                nums[index] = -Math.abs(nums[index]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                miss = i+1;
            }
        }
        return new int[] {duplicate, miss};
    }
}