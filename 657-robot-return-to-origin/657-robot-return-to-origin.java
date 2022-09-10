class Solution {
    public boolean judgeCircle(String moves) {
        int h =0,v=0;
        for(int i=0; i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                h++;
            }else if(moves.charAt(i)=='D'){
                h--;
            }else if(moves.charAt(i)=='L'){
                v++;
            }else{
                v--;
            }
        }
        return (h==0 && v==0);
    }
}