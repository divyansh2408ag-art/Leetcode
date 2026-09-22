class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j,m,n,k=0;
        m=accounts.length;
        n=accounts[0].length;
        int sum[]=new int[m];
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
                sum[i]+=accounts[i][j];
        if(sum[i]>k)
        k=sum[i];
        }
        return k;
    }
}