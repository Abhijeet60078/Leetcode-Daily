class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int n = s1.length();
        int m = s2.length();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < n; i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }

        // check first window
        if(Arrays.equals(count1, count2)){
            return true;
        }

        for(int i = n; i < m; i++){

            count2[s2.charAt(i)-'a']++;      // add new character
            count2[s2.charAt(i-n)-'a']--;    // remove old character

            if(Arrays.equals(count1, count2)){
                return true;
            }
        }

        return false;
        
    }
}