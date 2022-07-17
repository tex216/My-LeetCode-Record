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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode x, TreeNode y) {
        if (x == null && y == null) return true;
        if (x == null || y == null) return false;
        return (x.val == y.val) && isMirror(x.left, y.right) 
                                && isMirror(x.right, y.left);
    }
}