class Solution {
    public int findDuplicate(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(
            e -> e , Collectors.counting()
        )).entrySet().stream().filter(x -> x.getValue() >1).map(Map.Entry::getKey).findFirst().get();
    }
}