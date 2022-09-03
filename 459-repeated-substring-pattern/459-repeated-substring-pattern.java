class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int midL = l/2;
        for(int i=1;i<=midL;i++){
            String subS = s.substring(0,i);
            String temp=subS;
            if(l%subS.length()==0){
                int count = l/subS.length();
                for(int j=0;j<count-1;j++){
                    temp+=subS;
                }
                if(temp.equals(s)) return true;
            }
        }
        return false;
    }
}