class Solution {
    public int countKDifference(int[] nums, int k) {
        int i=0,j=nums.length-1,f=0;
        while(i!=nums.length)
        {
                if(Math.abs(nums[i]-nums[j])==k)
                f++;
                if(j==i)
                {
                    i++;
                    j=nums.length-1;
                }
                else
                j--;
        }
        return f;
    }
}