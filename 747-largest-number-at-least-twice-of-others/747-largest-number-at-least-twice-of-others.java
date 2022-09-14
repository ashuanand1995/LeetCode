class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int idx = -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
                idx = i;
            }else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        if(max >= 2 * max2){
            return idx;
        } else {
            return -1;
        }
    }
}