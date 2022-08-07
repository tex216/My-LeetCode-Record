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
    private int rootIdx;
    public TreeNode bstFromPreorder(int[] preorder) {
        rootIdx = 0;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode helper(int[] array, int minValue, int maxValue) {
        if (rootIdx >= array.length || array[rootIdx] <= minValue ||
            array[rootIdx] >= maxValue) return null;
        
        TreeNode tree = new TreeNode(array[rootIdx]);
        rootIdx++;
        tree.left = helper(array, minValue, tree.val);
        tree.right = helper(array, tree.val, maxValue);
        return tree;
    }
}