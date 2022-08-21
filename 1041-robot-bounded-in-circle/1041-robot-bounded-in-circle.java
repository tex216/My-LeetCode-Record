class Solution {
    public boolean isRobotBounded(String instructions) {
        //initial position and facing north
        int x = 0, y = 0, idx = 0;
        //store coordinates change after one cycle: north, east, south, west
        int[][] directions = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        for (int i = 0; i < instructions.length(); i++) {
            //left => go west => directions[3]
            if (instructions.charAt(i) == 'L') idx = (idx + 3) % 4;
            //right => go east => directions[1]
            else if (instructions.charAt(i) == 'R') idx = (idx + 1) % 4;
            else {
                x += directions[idx][0];
                y += directions[idx][1];
            }
        }
        // after one cycle: robot returns into initial position or robot doesn't face north (means it can turn back after more cycles)
        return (x == 0 && y == 0) || (idx != 0);
    }
}