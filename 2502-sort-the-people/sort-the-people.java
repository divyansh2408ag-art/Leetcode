class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i,j,t=0;
        String s="";
        for(i=0; i<heights.length; i++)
        {
            for(j=i+1; j<heights.length; j++)
            {
                if(heights[i]<heights[j])
                {
                    t=heights[i];
                    heights[i]=heights[j];
                    heights[j]=t;
                    s=names[i];
                    names[i]=names[j];
                    names[j]=s;
                }
            }
        }
        return names;
    }
}