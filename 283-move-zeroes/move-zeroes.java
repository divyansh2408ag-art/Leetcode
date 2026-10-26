class Solution {
    public void moveZeroes(int[] nums) {
        int start=0, end=nums.length-1,i;
        while(start<=end)
        {
            if(nums[start]==0)
            {
                for(i=start+1; i<=end; i++)
                    nums[i-1]=nums[i];
                nums[end]=0;
                end--;
            }
            else
                start++;
        }
    }
}