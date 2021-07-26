class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        else return subsetSum(nums,sum/2);
    }
    
    public boolean subsetSum(int[] nums,int subsetSum){
        boolean[][] t = new boolean[nums.length+1][subsetSum+1];
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<=subsetSum;j++){
                if(i==0) t[i][j]=false;
                if(j==0) t[i][j]=true;
            }
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=subsetSum;j++){
                if(nums[i-1]<=j){
                    t[i][j] = (t[i-1][j-nums[i-1]] || t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }                
            }
        }
        return t[nums.length][subsetSum];
    }
}
