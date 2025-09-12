class Solution {
    public boolean isPalindrome(int x) {
        int p=x;
        int val=0;
        while(x>0){
            int digit=x%10;
            val=val*10+digit;
            x/=10;

        }
        if(p==val){
            return true;
        }
        else{
            return false;
        }

        
    }
}