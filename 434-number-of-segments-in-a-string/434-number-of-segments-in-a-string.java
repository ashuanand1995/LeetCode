class Solution {
    public int countSegments(String s) {
        if(s==null) return 0;
        if(s.length()==0) return 0;
        int ans = 0;
        String[] strArr = s.split(" ");
        for(String str : strArr){
            if(!str.trim().isEmpty()) ans++;
        }
        return ans;
    }
}