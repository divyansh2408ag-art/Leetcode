class Solution {
    public boolean checkString(String s) {
        int i;
        for(i=0; i<s.length()-1; i++)
        {
            if(s.substring(i,i+2).equals("ba"))
                return false;
        }
        return true;
    }
}