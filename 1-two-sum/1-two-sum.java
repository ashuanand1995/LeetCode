class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int item = 0;item< nums.length; item++){
            if(map.containsKey(nums[item])){
                return new int[]{item, map.get(nums[item])};
            } else {
                map.put(target - nums[item], item);
            }
        }
        return null;
        
    }
}