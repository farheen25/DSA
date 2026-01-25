class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int e : nums) {
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        for(Map.Entry<Integer, Integer> el : map.entrySet()){
            int key = el.getKey();
            int count = el.getValue();
            int times = Math.min(count, 2);

            for(int c=0 ; c<times;c++){
                nums[i] = key;
                i++;
            }
        }
        return i;
    }
}