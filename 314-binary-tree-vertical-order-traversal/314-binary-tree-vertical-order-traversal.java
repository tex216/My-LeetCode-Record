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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;   
        Map<Integer, ArrayList> map = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        
        int column = 0, minCol = 0, maxCol = 0;
        queue.add(new Pair(root, column));
        
        //BFS
        while (queue.size() > 0) {
            Pair<TreeNode, Integer> p = queue.poll();
            root = p.getKey();
            column = p.getValue();
            
            if (root != null) {
                if (!map.containsKey(column)) {
                    map.put(column, new ArrayList<Integer>());
                }
                map.get(column).add(root.val);
                minCol = Math.min(minCol, column);
                maxCol = Math.max(maxCol, column);
                queue.add(new Pair(root.left, column-1));
                queue.add(new Pair(root.right, column+1));
            }    
        }
        //Avoid sorting by iterating through the range of the column index, this assumes no missing column index (no any broken branch in the tree) 
        for (int i = minCol; i <= maxCol; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }
}
     