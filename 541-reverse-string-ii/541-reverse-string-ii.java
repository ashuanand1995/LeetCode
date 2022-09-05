class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k){
            int l =i,r=Math.min(i+k-1,s.length()-1);
            while(l<r){
                char temp = a[l];
                a[l++] = a[r];
                a[r--] = temp;
            }
        }
        return new String(a);
    }
}