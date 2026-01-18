class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] original=new int[n+1];
        original[0]=first;
        for(int i=0;i<n;i++){
            original[i+1]=original[i]^encoded[i];
        }
        return original;

        
    }
}