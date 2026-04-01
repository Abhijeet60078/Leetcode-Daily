import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : map.keySet()) {

            // decrease frequency
            map.put(ch, map.get(ch) - 1);

            // check if all remaining frequencies are equal
            int freq = 0;
            boolean valid = true;

            for (int val : map.values()) {

                if (val == 0) continue;

                if (freq == 0) {
                    freq = val;
                } else if (val != freq) {
                    valid = false;
                    break;
                }
            }

            
            if (valid) return true;

            
            map.put(ch, map.get(ch) + 1);
        }

        return false;
    }
}