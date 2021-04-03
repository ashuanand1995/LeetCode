class Solution {
    public String defangIPaddr(String address) {
        int trueLength = address.length(), dotCount=0,index =0;
        char[] addressArr = address.toCharArray();
        for(int i = 0; i<trueLength; i++){
            if(addressArr[i]=='.'){
                dotCount++;
            }
        }
        index = trueLength + dotCount * 2;
        char[] resArr = new char[index]; 
        for(int i = trueLength-1; i>=0;i--){
            if(addressArr[i]=='.'){
                resArr[index-1] = ']';
                resArr[index-2] = '.';
                resArr[index-3] = '[';
                index = index - 3;
        } else{
                resArr[index-1] = addressArr[i];
                index--;
            }        
    }
        return new String(resArr);
}
}
