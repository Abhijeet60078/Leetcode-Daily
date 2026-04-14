class Solution {
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            if(isPalindrome(s,0,i)){
                dp[i]=0;
            }
            else{
                int min=Integer.MAX_VALUE;
                for(int j=0;j<i;j++){
                    if(isPalindrome(s,j+1,i)){
                        min=Math.min(min,dp[j]+1);
                    }
                }
                dp[i]=min;
            }
        }
        return dp[n-1];
        

    }
}