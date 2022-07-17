class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> ans = new ArrayList<>();
        int maxHeight = 0;
        for (int idx = heights.length - 1; idx >= 0; idx--) {
            if (heights[idx] > maxHeight) {
                ans.add(idx);
                maxHeight = heights[idx];
            }
        }
        //convert ArrayList to Array
        int[] ansArray = new int[ans.size()];
        //Collections.reverse(ans);
        for (int i=0; i < ans.size(); i++) {
            ansArray[i] = ans.get(ans.size()-1-i);
        }
        return ansArray;
    }
}