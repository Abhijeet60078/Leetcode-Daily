class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int prev = n & 1;   // get last bit
        n = n >> 1;         // shift right
        
        while (n > 0) {
            int curr = n & 1;   // get current last bit
            
            if (curr == prev) {
                return false;   // if same, not alternating
            }
            
            prev = curr;        // update previous bit
            n = n >> 1;         // shift right
        }
        
        return true;            // all bits alternate
    }
}
