class Solution {
    public long minEnd(int n, int x) {

        long res = x;
        long k = n - 1;
        int bit = 0;

        while (k > 0) {
            if ((x & (1L << bit)) == 0) {
                if ((k & 1L) == 1L) {
                    res |= (1L << bit);
                }
                k >>= 1;
            }
            bit++;
        }

        return res;
    }
}
