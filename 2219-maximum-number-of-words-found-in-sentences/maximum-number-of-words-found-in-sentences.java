class Solution {
    public int mostWordsFound(String[] sentences) {
        int i,j,f=1,max=0;
        for(j=0; j<sentences.length; j++)
        {f=1;
        for(i=0; i<sentences[j].length(); i++)
        {
            if(sentences[j].charAt(i)==' ')
            f++;
        }
            if(f>max)
            {
            max=f;
            
            }
        }
        return max;
    }
}