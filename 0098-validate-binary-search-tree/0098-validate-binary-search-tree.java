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
    
    public static boolean checkBST(TreeNode root, TreeNode min, TreeNode max){
        if(root == null)
            return true;
        
        if((min!=null && root.val<=min.val) || (max!=null && root.val>=max.val))
            return false;
        
        return checkBST(root.left, min, root) && checkBST(root.right, root, max);
    }

    public boolean isValidBST(TreeNode root) {
        return checkBST(root, null, null);
    }
        
}









