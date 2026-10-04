class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i;
        String s="",s1="";
        for(i=0; i<word1.length; i++)
            s+=word1[i];
        for(i=0; i<word2.length; i++)
            s1+=word2[i];
        if(s.equals(s1))
        return true;
        else
        return false;
        
    }
}