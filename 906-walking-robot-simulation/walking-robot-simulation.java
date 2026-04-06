import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        // Store obstacles in HashSet for O(1) lookup
        Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + "," + obs[1]);
        }
        
        // Directions: North, East, South, West
        int[][] dir = {
            {0, 1},   // North
            {1, 0},   // East
            {0, -1},  // South
            {-1, 0}   // West
        };
        
        int d = 0; // start facing North
        int x = 0, y = 0;
        int maxDist = 0;
        
        for (int cmd : commands) {
            
            // Turn right
            if (cmd == -1) {
                d = (d + 1) % 4;
            }
            
            // Turn left
            else if (cmd == -2) {
                d = (d + 3) % 4;
            }
            
            // Move forward
            else {
                for (int i = 0; i < cmd; i++) {
                    
                    int nx = x + dir[d][0];
                    int ny = y + dir[d][1];
                    
                    // Check obstacle
                    if (set.contains(nx + "," + ny)) {
                        break; // stop before obstacle
                    }
                    
                    x = nx;
                    y = ny;
                    
                    // Update max distance
                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }
        
        return maxDist;
    }
}