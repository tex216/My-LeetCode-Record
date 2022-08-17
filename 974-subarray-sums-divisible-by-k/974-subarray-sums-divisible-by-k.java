class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // Calculate the prefix sum and count it.
        int[] count = new int[k];
        count[0] = 1;
        int prefix = 0, ans = 0;
        for (int num : nums) {
            prefix = (prefix + num) % k; 
            // Java has negative modulus, correct to positive
            if (prefix < 0) prefix += k;
            ans += count[prefix];
            count[prefix]++;
        }
        return ans;
    }
}