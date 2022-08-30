class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] < nums[middle + 1]) left = middle + 1;
            else right = middle;
        }
        return left;
    }
}