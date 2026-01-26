class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums, target);
        int last =  last(nums, target);
        return new int[] {first, last};
    }

    public int first(int[] nums, int target)
        {
            int left=0, right= nums.length-1, ans=-1;
            while(left<=right)
            {
               int mid = left+(right-left)/2;
                if(nums[mid] == target)
                {
                    ans = mid;
                    right = mid-1;
                }
                else if(target<nums[mid])
                {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            return ans;
        }

         public int last(int[] nums, int target)
        {
            int left=0, right= nums.length-1, ans=-1;
            while(left<=right)
            {
               int mid = left+(right-left)/2;
                if(nums[mid] == target)
                {
                    ans = mid;
                    left = mid+1;
                }
                else if(target<nums[mid])
                {
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            return ans;
        }
}