class Solution {
    public int countDigits(int num) {
        int f=0,b=num;
        while(b!=0)
        {
            if(num%(b%10)==0)
                f++;
            b/=10;
        }
        return f;
    }
}