class Solution {
    public String truncateSentence(String s, int k) {
        int i,f=0;
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                k--;}f++;
                if(k==0)
                break;
            
        }if(i==s.length())
        return s;
        else
        return s.substring(0,f-1);
    }
}