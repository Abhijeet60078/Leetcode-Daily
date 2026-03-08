class Solution {
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int pin=1;
        int pin1=1;
        int min=0;
        for(int i=2;i<=n;i++){
            min=pin+pin1;
            pin1=pin;
            pin=min;
        }
        return min;
        
        
    }
}