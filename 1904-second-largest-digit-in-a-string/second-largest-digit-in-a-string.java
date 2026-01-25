class Solution {
    public int secondHighest(String s) {
        return Arrays.stream(s.split(""))
        .filter(x->x.matches("\\d"))
        .map(Integer::parseInt)
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(-1);
    }
}