class Solution {
    public int mirrorDistance(int n) {
        int original=n;
        int temp=0;

        while(n>0){
            int sum=n%10;
            temp=sum+temp*10;
            n/=10;

        }
        return Math.abs(original-temp);
        
    }
}