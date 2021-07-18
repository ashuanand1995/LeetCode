class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, counter = 0;
        for(char c : s.toCharArray()){
            if(c=='L') counter--;
            else counter++;
            if(counter==0) res++;
        }
        return res;
    }
}
