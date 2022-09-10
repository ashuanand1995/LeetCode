class Solution {
    public String reverseWords(String s) {
        String[] wordArr = s.split(" ");
        String res="";
        for(String word : wordArr){
            String temp = reverseString(word);
            if(res.length()==0){
                res = temp;
            }else{
                res = res + " " + temp;
            }
        }
        return res;
    }
    
    public String reverseString(String s){
        StringBuilder sb =  new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}