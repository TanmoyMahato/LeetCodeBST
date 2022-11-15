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
    
    boolean result=true;
    
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1)
            result = false;
        
        return Math.max(leftHeight, rightHeight)+1;
    }
    
    
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        getHeight(root);
        
        return result;       
        
    }
    
}
















