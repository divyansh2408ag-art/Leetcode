class Solution {
    public int smallestIndex(int[] nums) {
        int i, sum=0;
        for(i=0; i<nums.length; i++)
        {
            while(nums[i]!=0)
            {
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            if(sum==i)
            break;
            sum=0;
        }
        if(i==nums.length)
        return -1;
        else
        return sum;
    }
}