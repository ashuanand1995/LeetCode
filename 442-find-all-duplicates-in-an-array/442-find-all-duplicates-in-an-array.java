class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        for(int num : nums){
            int idx = Math.abs(num)-1;
            if(nums[idx] < 0){
                res.add(Math.abs(num));
            }
            nums[idx] *= -1;
        }
        return res;
    }
}