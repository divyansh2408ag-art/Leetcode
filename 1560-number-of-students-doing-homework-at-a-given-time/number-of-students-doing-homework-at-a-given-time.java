class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i,f=0;
        for(i=0; i<endTime.length; i++)
        {
            if(endTime[i]>=queryTime && startTime[i]<=queryTime)
                f++;
        }
        return f;
    }
}