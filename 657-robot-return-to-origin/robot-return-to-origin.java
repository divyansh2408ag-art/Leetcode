class Solution {
    public boolean judgeCircle(String moves) {
        int i,x=0,y=0;
        for(i=0; i<moves.length(); i=i+1)
        {
            if(moves.charAt(i)=='U')
                y++;
            else
            
                if(moves.charAt(i)=='D')
                y--;
                
            else
                if(moves.charAt(i)=='L')
                x--;
            else
                if(moves.charAt(i)=='R')
                    x++;
        }
        if(x==0 && y==0)
        return true;
        else
        return false;
    }
}