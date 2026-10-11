class Solution {
    public int sumOfSquares(int[] nums) {
        int i,n=nums.length,sum=0;
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            sum+=nums[i-1]*nums[i-1];
        }
        return sum;
    }
}