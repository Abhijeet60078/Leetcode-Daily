class Solution {

    public int minBitFlips(int start, int goal) {
        int count=0;
        int flip=start^goal;
        for(int i=0;i<32;i++){
            count+=(flip&1);
            flip>>=1;
        }
        return count;
        
    }
}