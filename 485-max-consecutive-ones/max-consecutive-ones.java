class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,f=0,g=-1;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
                f++;
            else
                f=0;
            g=Math.max(g,f);
        }
        return g;
    }
}