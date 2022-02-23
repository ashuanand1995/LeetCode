import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int endIndex = 0, startIndex = 0;
        int[] charLastIdxCount = new int[128];
        int res = 0;
        while(endIndex < s.length()){
             startIndex = Math.max(startIndex, charLastIdxCount[s.charAt(endIndex)]);
            res = Math.max(res,endIndex - startIndex + 1);
            charLastIdxCount[s.charAt(endIndex)] = endIndex + 1;
            endIndex++;
        }
        return res;        
    }
}
