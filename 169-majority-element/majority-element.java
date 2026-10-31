class Solution {
    public int majorityElement(int[] nums) {
        int i,count=0,el=0;
        for(i=0; i<nums.length; i++)
        {
            if(count==0)
            {
                count=1;
                el=nums[i];
            }
            else
            if(nums[i]==el)
                count++;
            else
                count--;
        }
        return el;
    }
}