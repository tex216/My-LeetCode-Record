class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = this.findBound(nums, target, true);
        int second = this.findBound(nums, target, false);
        if (first == -1) {
            return new int[] {-1, -1};
        }
        return new int[] {first, second};
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                if (isFirst) {
                    if (middle == left || nums[middle - 1] != target) {
                        return middle;
                    }
                    right = middle - 1;
                }
                else {
                    if (middle == right || nums[middle + 1] != target) {
                        return middle;
                    }
                    left = middle + 1;
                }
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
}