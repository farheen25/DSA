class Solution {
    public int reverse(int x) {
        String str = String.valueOf(Math.abs(x));
        char[] c = str.toCharArray();
        int left=0, right=c.length-1;
        boolean isNegative = x<0;
        while(left<right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        try{
        int reversed = Integer.parseInt(new String(c));
        return isNegative ? -reversed : reversed;
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
    }
}