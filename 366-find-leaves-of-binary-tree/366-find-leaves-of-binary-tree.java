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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        getHeight(root, ans);
        return ans;
    }
    
    private int getHeight(TreeNode root, List<List<Integer>> ans) {
        if (root == null) return -1;
        
        int left = getHeight(root.left, ans);
        int right = getHeight(root.right, ans);
        
        int height = Integer.max(left, right) + 1;
        if (height >= ans.size()) {
            ans.add(new ArrayList());
        }
        ans.get(height).add(root.val);
        return height;
        
    }
}