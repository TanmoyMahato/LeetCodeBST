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
    ArrayList<String> pathList = new ArrayList<>();
    
    public void preorderTraversal(TreeNode root, String strpath){
        if(root == null)
            return;
        
        if(root.left==null && root.right==null)
            pathList.add(strpath + root.val);
        
        preorderTraversal(root.left, strpath+root.val+"->");
        preorderTraversal(root.right, strpath+root.val+"->");
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        preorderTraversal(root,"");
        return pathList;
    }
}