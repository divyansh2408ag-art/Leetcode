class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j,k=0,sum=0;
        for(i=0; i<accounts.length; i++)
        {
            sum=0;
            for(j=0; j<accounts[i].length; j++)
                sum+=accounts[i][j];
        k=Math.max(sum, k);
        }
        return k;
    }
}