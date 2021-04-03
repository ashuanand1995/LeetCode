class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0, maxSum = 0;
        for(int[] account : accounts){
            
            for(int wealth : account){
                sum += wealth;
            }
            if(maxSum < sum){
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }
}
