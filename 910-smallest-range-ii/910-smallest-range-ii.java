class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0], max = nums[nums.length - 1];
        int ans = max - min;
        
        for (int i = 0; i < nums.length - 1; i++) {
            int curr_max = Math.max(max - k, nums[i] + k);
            int curr_min = Math.min(min + k, nums[i+1] - k);
            ans = Math.min(ans, curr_max - curr_min);
        } 
        return ans;
    }
}