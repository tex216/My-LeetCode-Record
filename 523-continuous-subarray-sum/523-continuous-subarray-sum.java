class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //if we can find any two subarray of prefix sum have same mod value, then their difference MUST be divisible by k. So we can use a map to store mod value of each prefix sum in map, with its index. Then check if map contains the same mod value with size > 2 when we have new mod value in every iteration
        if (nums.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        // Any subarray starting with index 0 will need put mod value 0 and index -1 to make it as a true case
        map.put(0, -1);
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (k != 0) currSum %= k; 
            if (map.containsKey(currSum)) {
                if (i - map.get(currSum) > 1) return true;
            }
            else map.put(currSum, i);
        }
        return false;
    }
}