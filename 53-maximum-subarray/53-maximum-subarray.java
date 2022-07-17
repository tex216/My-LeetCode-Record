class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int maxSub = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], nums[i]+current);
            maxSub = Math.max(maxSub, current);
        }
        return maxSub;
    }
}