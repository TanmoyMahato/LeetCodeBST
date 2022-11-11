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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
      //if root is null 
        if(root == null){
           return (new TreeNode(val));
        }
        
      //if val is less than root
        if(val < root.val)
            root.left = insertIntoBST(root.left, val);
        
      //if val is greater than root
        else
            root.right = insertIntoBST(root.right, val);
        
        return root;
    }
}