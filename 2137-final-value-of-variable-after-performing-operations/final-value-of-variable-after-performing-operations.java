class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i,x=0;
        for(i=0; i<operations.length; i++)
        {
            if(operations[i].charAt(1)=='+')
            x++;
            else
            x--;
        }
        return x;
    }
}