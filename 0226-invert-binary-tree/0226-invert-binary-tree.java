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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        
     // get left & right nodes of the root node
        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);
        
     // interchange left & right nodes of root
        root.left = rightNode;
        root.right = leftNode;
        
        return root;
    }
}