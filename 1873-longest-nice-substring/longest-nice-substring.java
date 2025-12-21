class Solution {
    public String longestNiceSubstring(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) { // FIXED

                String sub = s.substring(i, j);
                boolean nice = true;

                for (int k = 0; k < sub.length(); k++) {
                    char c = sub.charAt(k);

                    if (!sub.contains(Character.toLowerCase(c) + "") ||
                        !sub.contains(Character.toUpperCase(c) + "")) {
                        nice = false;
                        break;
                    }
                }

                if (nice && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }
}
