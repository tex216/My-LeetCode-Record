class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int remainders[] = new int[60];
        int count = 0;
        for (int t : time) {
            //we want to know for each t, how many x satisfy (t + x) % 60 = 0. Aka. x % 60 = 60 - t % 60. But if t % 60 = 0, x % 60 = 0 instead of 60.
            //One solution is to use x % 60 = (60 - t % 60) % 60 to avoid 60x.
            count += remainders[(60 - t % 60) % 60];
            remainders[t % 60]++;
        }
        return count;
    }
}