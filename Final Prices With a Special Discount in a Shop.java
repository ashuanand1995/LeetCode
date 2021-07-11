class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int curr = prices[i];
            if(i+1<prices.length){
                for(int j=i+1;j<prices.length;j++){
                int temp = prices[j];
                if(temp<=curr){
                    curr = curr - temp;                    
                    break;
                }
            }
            }
            res[i] = curr;
        }
        return res;
    }
}
