class Solution {
    public void rotate(int[][] matrix) {
        int i,j,n=matrix.length,t,left,right;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i<=j){
                t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }}
        }
        for(i=0; i<n; i++)
        {
            left=0;
            right=n-1;
            while(left<right)
            {
                t=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=t;
                left++;
                right--;
            }
}
}}