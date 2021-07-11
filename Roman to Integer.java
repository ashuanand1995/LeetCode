class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int res =0;
        for(int i=0;i<len;i++){
            int val1 = value(s.charAt(i));
            if(i+1<len){
                int val2 = value(s.charAt(i+1));
                if(val2>val1){
                    res = res - val1;
                }else{
                    res = res + val1;
                }
            }else{
                res = res + val1;
            }
        }
        return res;
    }
   public int value(char r) 
    { 
    if (r == 'I') 
      return 1; 
    if (r == 'V') 
      return 5; 
    if (r == 'X') 
      return 10; 
    if (r == 'L') 
      return 50; 
    if (r == 'C') 
      return 100; 
    if (r == 'D') 
      return 500; 
    if (r == 'M') 
      return 1000; 
    return -1; 
  }
}
