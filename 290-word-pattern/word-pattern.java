class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int n = pattern.length();

        if (n != words.length) return false;

       
        int[] pFirst = new int[n];
        int[] wFirst = new int[n];
        for (int i = 0; i < n; i++) {
            pFirst[i] = i;
            for (int j = 0; j < i; j++) {
                if (pattern.charAt(j) == pattern.charAt(i)) {
                    pFirst[i] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            wFirst[i] = i; 
            for (int j = 0; j < i; j++) {
                if (words[j].equals(words[i])) {
                    wFirst[i] = j;
                    break;
                }
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (pFirst[i] != wFirst[i]) return false;
        }

        return true;
        
    }
}