import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int match = target - nums[i];
            if (map.containsKey(match)) {
                return new int[] {map.get(match), i};
            }
            else {
                map.put(nums[i], i);
            }
            
        }
        return null;
     
    }
}