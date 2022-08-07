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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length-1);
    }
    
    public TreeNode constructBST(int[] nums, int start, int end) {
        if (end < start) return null;
        int middle = (start + end) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = constructBST(nums, start, middle - 1);
        root.right = constructBST(nums, middle + 1, end);
        return root;
    }
}