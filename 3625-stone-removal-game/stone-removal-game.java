class Solution {
    public boolean canAliceWin(int n) {
        int a=10;
        while(n>0 && a!=0)
        {
            n-=a;
            if(n<0 && a%2==0)
                return false;
            else
            if(n<0 && a%2!=0)
            return true;
            else
            if(n==0 && a%2==0)
                return true;
            else
            if(n==0 && a%2!=0)
            return false;
            a--;
        }
        
        return false;
    }
}