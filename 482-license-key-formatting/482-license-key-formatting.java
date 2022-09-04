class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='-'){
                if(sb.length()==0){
                    sb.append(s.charAt(i));
                }else{
                   sb.append((sb.length() % (k+1) == k) ? '-' : "").append(s.charAt(i)); 
                }
                
            }
        }
        return sb.reverse().toString().toUpperCase();
    }
}