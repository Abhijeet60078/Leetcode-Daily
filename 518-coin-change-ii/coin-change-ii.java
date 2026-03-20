class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int cell:coins){
            for(int i=cell;i<=amount;i++){
                dp[i]+=dp[i-cell];


            }

        }
        return dp[amount];


        
    }
}