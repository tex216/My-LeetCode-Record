/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    
    public int findCelebrity(int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (knows(ans, i)) ans = i;
        }
        
        if (isCelebrity(n, ans)) return ans;
        return -1;
    }
    
    private boolean isCelebrity(int n, int ans) {
        for (int i = 0; i < n; i++) {
            if (i == ans) continue; //avoid comparing itself
            if (knows(ans, i) || !knows(i, ans)) return false;
        }
        return true;
    }
}