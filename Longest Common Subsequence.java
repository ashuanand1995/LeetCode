///DP with Top-down approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int res = 0;
        int len1=text1.length();
        int len2 = text2.length();
        int[][] t = new int[len1+1][len2+1];
        for(int i=0;i<len1+1;i++){
            for(int j=0;j<len2+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                   t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        
        return t[len1][len2];
    }
    

}

//DP with Memoization approach
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int res = 0;
        int[][] t = new int[text1.length()+1][text2.length()+1];
        for(int[] row : t){
            Arrays.fill(row,-1);
        }
        
        res = maxLCS(text1,text2,text1.length(),text2.length(),t);
        return res;
    }
    
    public int maxLCS(String t1,String t2,int n,int m,int[][] t){
        if(n==0 || m==0) return 0;
        if(t[n][m]!=-1) return t[n][m];
        if(t1.charAt(n-1)==t2.charAt(m-1)){
            return t[n][m] = 1 + maxLCS(t1,t2,n-1,m-1,t);
        } else {
            return t[n][m]=Math.max(maxLCS(t1,t2,n,m-1,t),maxLCS(t1,t2,n-1,m,t));
        }
    }
}


//Recursive Solution
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int res = 0;
        res = maxLCS(text1,text2,text1.length(),text2.length());
        return res;
    }
    
    public int maxLCS(String t1,String t2,int n,int m){
        if(n==0 || m==0) return 0;
        if(t1.charAt(n-1)==t2.charAt(m-1)){
            return 1 + maxLCS(t1,t2,n-1,m-1);
        } else {
            return Math.max(maxLCS(t1,t2,n,m-1),maxLCS(t1,t2,n-1,m));
        }
    }
}
