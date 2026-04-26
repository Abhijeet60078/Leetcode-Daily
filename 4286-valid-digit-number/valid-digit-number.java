class Solution {
    public boolean validDigit(int n, int x) {
        String s = n + "";
        char d = (char)(x + '0');
        return s.charAt(0) != d && s.indexOf(d) != -1;
    }
}