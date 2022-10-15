class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //sliding window approach
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = s.length(), n2 = p.length();
        if (n1 == 0 || n2 == 0 || n1 < n2) return new ArrayList<Integer>();
        
        int[] counterS = new int[26];
        int[] counterP = new int[26];
        //string p is a reference
        for (char c : p.toCharArray()) {
            counterP[c - 'a']++;
        }
        
        //sliding window on string s
        for (int i = 0; i < n1; i++) {
            counterS[s.charAt(i) - 'a']++;
            if (i >= n2) {
                counterS[s.charAt(i - n2) - 'a']--;
            }
            if (Arrays.equals(counterS, counterP)) {
                ans.add(i - n2 + 1);
            }
        }
        return ans;
    }
}