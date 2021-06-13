class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for(int i=0; i<boxes.length();i++){
            int count = 0;
            for(int j=0;j<boxes.length();j++){
                if(j==i) continue;
                if(boxes.charAt(j)=='1')
                count+= Math.abs(j-i);
            }
            res[i] = count;
        }
        return res;
    }
}
