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
    public int closestValue(TreeNode root, double target) {
        TreeNode currNode = root;
        int closest = root.val;
        while (currNode != null) {
            if (Math.abs(currNode.val-target) < Math.abs(closest-target)) {
                closest = currNode.val;
            }
            if (currNode.val < target) {
                currNode = currNode.right;
            }
            else if (currNode.val > target) {
                currNode = currNode.left;
            }
            else {
                break;
            }
        }
        return closest;
    }
}