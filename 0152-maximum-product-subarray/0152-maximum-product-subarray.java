class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currentProd = res;
        int currentMinProd = res;
        int n = nums.length;
        for(int i=1;i<n;i++){
            int maxprod = nums[i]*currentProd;
            int minProd = currentMinProd*nums[i];
            currentProd = Math.max(Math.max(maxprod,minProd),nums[i]);
            currentMinProd = Math.min(Math.min(maxprod,minProd),nums[i]);
            res = Math.max(res,currentProd);
            System.out.println("Res:"+res);
        }
        return res;
    }
}