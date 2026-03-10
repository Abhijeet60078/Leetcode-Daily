class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            return result;
        }

        int n = p.length();
        int m = s.length();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // count frequency of p and first window of s
        for(int i = 0; i < n; i++){
            count1[p.charAt(i) - 'a']++;
            count2[s.charAt(i) - 'a']++;
        }

        // check first window
        if(Arrays.equals(count1, count2)){
            result.add(0);
        }

        // slide window
        for(int i = n; i < m; i++){

            count2[s.charAt(i) - 'a']++;      // add new character
            count2[s.charAt(i-n) - 'a']--;    // remove old character

            if(Arrays.equals(count1, count2)){
                result.add(i - n + 1);
            }
        }

        return result;

   
    }
}