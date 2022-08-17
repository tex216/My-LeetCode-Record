//put val at startIndex and -val at endIndex + 1

//Put val at startIndex allows the val to be carried to the next index starting from startIndex when we do the sum accumulation.

//Put -val at endIndex + 1 simply means cancel out the previous carry from the next index of the endIndex, because the previous carry should not be counted beyond endIndex.

class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        for (int[] update : updates) {
            int start = update[0], end = update[1], val = update[2];
            ans[start] += val;
            if (end < length-1) ans[end+1] -= val;
        }
        
        int curr = 0;
        // range caching
        for (int i = 0; i < length; i++) {
            curr += ans[i];
            ans[i] = curr;
        }
        return ans;
    }
}