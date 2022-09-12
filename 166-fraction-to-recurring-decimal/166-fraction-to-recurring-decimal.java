class Solution {
    public String fractionToDecimal(int num, int den) {
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        String sign = (((num > 0) ^ (den > 0)) ? "-" : "");
        sb.append(sign);
        long a = Math.abs((long) num), b = Math.abs((long) den);
        sb.append(a/b);
        
        //integral case
        long remainder = a % b;
        if (remainder == 0) return sb.toString();
        
        //fractional case
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            remainder *= 10;
            sb.append(remainder / b);
            remainder %= b; 
            
            if (!map.containsKey(remainder)){
                map.put(remainder, sb.length());
            }
            else {
                int idx = map.get(remainder);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            }
        }
        
        return sb.toString();
    }
}