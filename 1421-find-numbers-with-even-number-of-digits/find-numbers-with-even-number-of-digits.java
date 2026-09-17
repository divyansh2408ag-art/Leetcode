class Solution {
    public int findNumbers(int[] nums) {
        int i,f=0,g=0;
        for(i=0; i<nums.length; i++)
        {
            while(nums[i]!=0)
            {
                f++;
                nums[i]/=10;
            }
        if(f%2==0)
        g++;
        f=0;
        }
        return g;
    }
}