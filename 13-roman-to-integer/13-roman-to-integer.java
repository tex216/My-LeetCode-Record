class Solution {
    static Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);  
    }
    
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            int curr = map.get(s.charAt(i));
            int next = (i+1 < s.length()) ? map.get(s.charAt(i+1)) : 0;
            if (curr < next) {
                sum += next - curr;
                i += 2;
            }
            else {
                sum += curr;
                i++;
            }
        }
        return sum;
    }
}