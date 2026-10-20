class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i,f=0,n=arr.length;
        for(i=0; i<n; i++)
        {
            if(f==3)
            break;
            f=((arr[i] & 1)==1)? f+1 : 0;
        }
        if(f!=3)
            return false;
            else
            return true;
    }
}