class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            int remainder = sum % k; 
            // Because -1 % 5 = -1, but we need the positive mod 4
            if (remainder < 0) remainder += k;
            count += freq[remainder];
            freq[remainder]++;
        }
        return count;
    }
}