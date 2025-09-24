class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder result = new StringBuilder(a);
        int count = 1;

        // Keep appending until result length >= b length
        while (result.length() < b.length()) {
            result.append(a);
            count++;
        }

        // Check if b is substring now
        if (result.indexOf(b) != -1) {
            return count;
        }

        // Try one more repetition
        result.append(a);
        count++;
        if (result.indexOf(b) != -1) {
            return count;
        }

        // If still not found, return -1
        return -1;
    }
}
