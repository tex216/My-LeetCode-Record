class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(nums[i])) {
                if (nums[i] == target) {
                    return map.get(nums[i]);
                }
            } 
        }
        return -1;
    }
}