class Solution {
    public boolean detectCapitalUse(String word) {
        int i,f=0;
        for(i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
                f++; 
        }
        if(f==1 && Character.isUpperCase(word.charAt(0)))
        return true;
        else
        if(f==word.length())
        return true;
        else
        if(f==0)
        return true;
        else
        return false;
    }
}