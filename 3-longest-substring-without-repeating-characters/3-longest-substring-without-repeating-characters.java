class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charCount = new int[128];
        int l=0,r=0;
        int res = 0;
        while(r<s.length()){
            l=Math.max(l,charCount[s.charAt(r)]);
            res = Math.max(res, r-l+1);
            charCount[s.charAt(r)] = r+1;
            r++;
        }
       return res; 
    }
}