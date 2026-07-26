class Solution {
    public int[] rearrangeArray(int[] nums) {
        int postive=0, negative=1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[postive] = nums[i];
                postive+=2;
            }
            else {
                arr[negative] = nums[i];
                negative+=2;
            }
        }
        return arr;
    }
}