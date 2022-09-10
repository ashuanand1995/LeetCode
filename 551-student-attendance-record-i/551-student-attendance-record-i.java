class Solution {
    public boolean checkRecord(String s) {
        int lateCount=0;
        int absentCount = 0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                absentCount++;
                lateCount=0;
            }else if(c == 'L'){
                lateCount++;                
            }else{
                lateCount=0;
            }
            
            if(lateCount==3){
                return false;
            }
        }
        if(absentCount>1) return false;
        return true;
    }
}