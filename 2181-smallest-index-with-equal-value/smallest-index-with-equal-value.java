class Solution {
    public int smallestEqual(int[] nums) {
        int i;
        for(i=0; i<nums.length; i++)
        {
            if(i%10==nums[i])
            break;
        }
        if(i<nums.length)
        return i;
        else
        return -1;
    }
}