class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        return false;
        int reverse = 0, rem = 0, original = x;
        while(x!=0)
        {
            rem = x %10;
            reverse = reverse *10 + rem;
            x /= 10;
        }
        return reverse == original;
}
}