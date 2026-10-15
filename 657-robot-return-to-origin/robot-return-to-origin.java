class Solution {
    public boolean judgeCircle(String moves) {
        int i,x=0,y=0;
        char c='\u0000';
        for(i=0; i<moves.length(); i=i+1)
        {
            c=moves.charAt(i);
            if(c=='U')
                y++;
            else
                if(c=='D')
                y--;
            else
                if(c=='L')
                x--;
            else
                if(c=='R')
                    x++;
        }
        if(x==0 && y==0)
        return true;
        else
        return false;
    }
}