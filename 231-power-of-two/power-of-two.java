class Solution {
    public boolean isPowerOfTwo(int n) {
        int i;
       if(n==1)
       return true;
       else
       if(n%2!=0 || n<=0)
       return false;
       return isPowerOfTwo(n/2);
    }
}