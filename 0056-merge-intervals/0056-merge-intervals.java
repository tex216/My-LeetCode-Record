class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        List<int[]> ans = new ArrayList<>();
        int[] prev = null;
        for(int[] i : intervals) {
            //empty or no overlap exist
            if (ans.isEmpty() || prev[1] < i[0]) {
                ans.add(i);
                prev = i;
            }
            //otherwise, overlap exist, do merge
            else {
                prev[1] = Math.max(prev[1], i[1]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}