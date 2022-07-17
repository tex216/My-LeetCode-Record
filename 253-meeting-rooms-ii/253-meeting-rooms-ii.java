class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {return 0;}
        
        // Sort the intervals by start time
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
         //Min heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->
                                                      (a[1]-b[1]));
        for(int[] i:intervals){
            if(!pq.isEmpty() && pq.peek()[1] <= i[0]){
                pq.poll();
            }
            pq.add(i);
        }
        
        return pq.size();
    }
}