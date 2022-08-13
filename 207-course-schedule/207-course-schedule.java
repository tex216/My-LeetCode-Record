class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        //build the graph
        for (int[] group : prereq) {
            if (map.containsKey(group[1])) {
                map.get(group[1]).add(group[0]);
            }
            else {
                List<Integer> list = new LinkedList<>();
                list.add(group[0]);
                map.put(group[1], list);
            }
        }
        
        boolean[] checked = new boolean[numCourses];
        boolean[] cycle = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            if (this.isCyclic(i, map, checked, cycle)) return false;
        }
        return true;
    }
    
    private boolean isCyclic(int course, Map<Integer, List<Integer>>                                map, boolean[] checked, boolean[] cycle) {
        if (checked[course]) return false;
        if (cycle[course]) return true;
        if (!map.containsKey(course)) return false;
        
        cycle[course] = true;
        
        //DFS
        for (int i : map.get(course)) {
            if (this.isCyclic(i, map, checked, cycle)) return true;
        }
        
        cycle[course] = false;
        checked[course] = true;
        return false;
    }
}