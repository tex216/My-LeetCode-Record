class Solution {
    public int minNumberOfFrogs(String s) {
        String croak = "croak";
        int[] count = new int[5];
        int num = 0, ans = 0;
        for (char c : s.toCharArray()) {
            int idx = croak.indexOf(c); //0-4
            if (idx > 0 && count[idx-1] == 0) return -1;
            //for each c
            if (idx > 0) count[idx-1]--;
            count[idx]++;
            
            if (idx == 0) num++;
            
            if (idx == 4) num--;
            
            ans = Math.max(ans, num);
        }
        return (count[0] + count[1] + count[2] + count[3] > 0) ? -1 : ans;
      
    }
}