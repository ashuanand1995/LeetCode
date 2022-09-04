class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-", "").toUpperCase();
    StringBuilder sb = new StringBuilder(S);
    // Starting from the end of sb, and going backwards. 
    int i = sb.length() - K;
    while(i > 0) {
        sb.insert(i, '-');
        i = i - K;
    }
    return sb.toString();
    }
}