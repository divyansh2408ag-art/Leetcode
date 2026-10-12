class Solution {
    public int countKDifference(int[] nums, int k) {
        int i,j,f=0;
        for(i=0; i<nums.length; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                f++;
            }
        }
        return f;
    }
}