class Solution {
    public boolean checkIfPangram(String str) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        return s.size() == 26;
    }
}