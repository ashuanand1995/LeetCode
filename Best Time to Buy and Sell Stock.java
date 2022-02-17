class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int op = 0;
        for(int i=0;i<prices.length;i++){
            price = Math.min(price,prices[i]);
            if(price<prices[i]){
                op=Math.max(op,prices[i]-price);
            }
        }
        return op;
    }    
}
