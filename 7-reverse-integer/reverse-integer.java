class Solution {
    public int reverse(int x) {
        long ans=0;
        
        while(x!=0){
            int temp=x%10;
            ans=ans*10+temp;
            x/=10;
        }
        if(Integer.MAX_VALUE<ans||Integer.MIN_VALUE>ans){
            return 0;
        }
        return (int)ans;
        
    }
}