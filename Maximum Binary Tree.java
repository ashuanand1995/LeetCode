/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length<1) return null;
        int maxInd = maxVal(nums);
        TreeNode node = new TreeNode(nums[maxVal(nums)]);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxInd));
        if(maxInd<nums.length) {
            node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxInd+1, nums.length));
        }
        else{
           node.right = null; 
        }
        return node;
    }
    public int maxVal(int[] nums){
        if(nums == null || nums.length ==0) return -1;
        int ind = 0;
        int largest = 0;
        for(int num : nums){
            if(num > nums[largest]){
                largest = ind;
            }
            ind++;
        }
        return largest;
    }
}
