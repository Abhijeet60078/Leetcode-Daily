class Solution {
    public int tribonacci(int n) {
    if(n==0){
        return 0;

    }
    if(n==1||n==2){
        return 1;
        }
        int pin=0;
        int pin1=1;
        int pin2=1;
        for(int i=3;i<=n;i++){
            int mid=pin+pin1+pin2;
            pin=pin1;
            pin1=pin2;
            pin2=mid;
        
        }
        return pin2;




        

    }
}