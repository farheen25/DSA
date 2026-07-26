class Solution {
    public int majorityElement(int[] nums) {
        int count=0, el=0,count1=0, n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count++;
                el = nums[i];
            }
            else if (nums[i] == el)
            {
                count++;
            }
            else {
                count--;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i] == el)
            {
                count1++;
            }
        }
        if(count1>n/2)
        {
            return el;
        }
        return -1;
    }
}