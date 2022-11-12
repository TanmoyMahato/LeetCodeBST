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
    int sum=0;
    
    public void inOrderTraversal(TreeNode root, int low, int high){
        if(root == null)
            return;
        
        inOrderTraversal(root.left, low, high);
        if(root.val>=low && root.val<=high)
            sum += root.val;
        inOrderTraversal(root.right, low, high);
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        inOrderTraversal(root, low, high);
        return sum;
    }
}