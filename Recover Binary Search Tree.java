//Solution using stack


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
    public void recoverTree(TreeNode root) {
        TreeNode prev=null , first=null ,second=null;
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            if(prev!=null && curr.val<prev.val){
                if(first==null){
                    first=prev;
                }
                second = curr;                
            }
            prev=curr;
            curr=curr.right;
        }
        int temp = first.val;
        first.val = second.val;
        second.val=temp;
}
}
