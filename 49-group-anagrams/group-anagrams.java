class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<> (Arrays.stream(strs).collect(
            Collectors.groupingBy(
                word -> Arrays.stream(word.split(""))
                .map(c -> c.toLowerCase())
                .sorted()
                .collect(Collectors.joining())
            )
        ).values()
        );
}
}