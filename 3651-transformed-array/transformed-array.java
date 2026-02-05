class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{
                int newI=(i+nums[i])%n;
                if(newI<0){
                    newI+=n;
                }
                ans[i]=nums[newI];
            }
        }
        return ans;
        
    }
}
