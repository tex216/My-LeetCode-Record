class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int min_height = Math.min(height[left], height[right]);
            max_area = Math.max(max_area, width * min_height);
            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max_area;
    }
}