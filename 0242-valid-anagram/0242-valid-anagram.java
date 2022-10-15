class Solution {
    public boolean isAnagram(String s, String t) {
        //Method 1: sorting, O(nlogn) time, O(1) space
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}