class Solution(object):
    def minMeetingRooms(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        if not intervals: return 0
        
        # heap initialization
        in_use = []
        max_room = 0
        intervals.sort()
        
        for meeting in intervals:
            while in_use and in_use[0] <= meeting[0]:
                heapq.heappop(in_use)
            heapq.heappush(in_use, meeting[1])
            max_room = max(max_room, len(in_use))
            
        return max_room
        
        