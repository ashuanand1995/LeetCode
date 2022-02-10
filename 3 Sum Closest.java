class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum =0;
        int min_diff=Integer.MAX_VALUE;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int j = i+1;
            int k=len-1;
            while(j<k){
                int val = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target-val);
                if(min_diff>diff){
                    sum = val;
                    min_diff=diff;
                } if(val<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return sum;
    }
}
