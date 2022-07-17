class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                //skip all characteres before the duplicate one
                left = Math.max(left, map.get(c)+1);
            }
            length = Math.max(length, right-left+1);
            //store index of each character
            map.put(c, right);
        }
        return length;
    }
}