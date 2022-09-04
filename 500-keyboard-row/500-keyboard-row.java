class Solution {
    public String[] findWords(String[] words) {
        int[] charRowMap = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        String[] w = new String[words.length];
        int index = 0;
        for(String s:words){
            if(checkForWord(s.toLowerCase(),charRowMap)){
                w[index++] = s;
            }
        }
        return Arrays.copyOfRange(w,0,index);
    }
    public boolean checkForWord(String s,int[] charMap){
        int row = charMap[s.charAt(0)-'a'];
        for(char c : s.toCharArray()){
            if(charMap[c-'a']!=row) {
                return false;
            }
        }
        return true;
    }
    
}