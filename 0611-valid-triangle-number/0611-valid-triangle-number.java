class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        //i = 0, j = k-1, k = nums.length-1
        int count = 0;
        for (int k = nums.length - 1; k > 1; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += j - i;
                    j--;
                }
                else i++;
            }
        }
        return count;
    }
}