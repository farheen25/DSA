class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int rem = 0;
        int original = x;
        while(x!=0){
          rem = x%10;
          sum += rem;
            x/=10;
        }

        if(original%sum == 0)
        return sum;
        else
        return -1;
    }
}