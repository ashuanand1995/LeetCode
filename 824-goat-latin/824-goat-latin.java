class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String res = "";
        String suffix = "";
        for(int m=0;m<words.length;m++){
            suffix += "a";
            String word = words[m];
            if(word.charAt(0)== 'a' || word.charAt(0)== 'e' || word.charAt(0)== 'i' || word.charAt(0)== 'o' ||                      word.charAt(0)== 'u' || word.charAt(0)== 'A' || word.charAt(0)== 'E' || word.charAt(0)== 'I' ||                     word.charAt(0)== 'O' || word.charAt(0)== 'U'){
                if(res.length() == 0){
                    res = word + "ma" + suffix;
                }else {
                    res = res +" "+ word + "ma" + suffix;
                }
            }else{
                char[] charArr = word.toCharArray();
                for(int i=0;i<charArr.length-1;i++) {
                    char temp = charArr[i+1];
                    charArr[i+1] = charArr[i];
                    charArr[i] = temp;
                }
                String str = String.copyValueOf(charArr);
                if(res.length() == 0){
                    res = str + "ma" + suffix;
                }else {
                    res = res +" "+ str + "ma" + suffix;
                }
            }
        }
        return res;
    }
}