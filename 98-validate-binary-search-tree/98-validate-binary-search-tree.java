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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean helper(TreeNode tree, long minValue, long maxValue) {
        if (tree == null) return true;
        if (tree.val <= minValue || tree.val >= maxValue) return false;
        boolean isLeftValid = helper(tree.left, minValue, tree.val);
        boolean isRightValid = helper(tree.right, tree.val, maxValue);
        return isLeftValid && isRightValid;
  }
}