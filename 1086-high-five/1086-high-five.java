class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
        //create min heap
        for (int[] item : items) {
            int id = item[0], score = item[1];
            if (!map.containsKey(id)) map.put(id, new PriorityQueue<>());
            //else: add the score in the min heap
            map.get(id).add(score);
            if (map.get(id).size() > 5) map.get(id).poll();
        }
        
        int[][] ans = new int[map.size()][2];
        int index = 0;
        for (int id : map.keySet()) {
            ans[index][0] = id;
            int count = 0, sum = 0;
            while (count < 5) {
                sum += map.get(id).poll();
                count++;
            }
            ans[index][1] = sum / 5;
            index++;
        }
        
        return ans;
    }
}