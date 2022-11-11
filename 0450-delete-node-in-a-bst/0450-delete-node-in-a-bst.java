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
    
    private TreeNode findSuccessor(TreeNode root){
        while(root.left != null)
            root = root.left;
        
        return root;
    }
    
    public TreeNode deleteNode(TreeNode root, int val) {
        
      //if(root is null)
        if(root == null)
            return null;
        
      //if(val is less than root.val)
        if(val < root.val)
            root.left = deleteNode(root.left, val);
        
      //if(cal is greater than root.val)
        else if(val > root.val)
            root.right = deleteNode(root.right, val);
        
      //else(val is equal to root.val)
        else{
            //case1: leaf node
            if(root.left == null && root.right == null)
                return null;
            
            //case2: only right child present
            if(root.left == null)
                return root.right;
            
            //case3: only left child present
            if(root.right == null)
                return root.left;
            
            //case4: both child are present
            TreeNode inorderSuccessor = findSuccessor(root.right);
            root.val = inorderSuccessor.val;
            root.right = deleteNode(root.right, inorderSuccessor.val);
        }
        
        return root;
    }
    
}

















