class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
            int n=nums.length;
            int[] num1=new int[n/2];
            for(int i=0;i<n/2;i++){
                if(i%2==0){
                    num1[i]=Math.min(nums[2*i],nums[2*i+1]);
                }
                else{
                    num1[i]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }
            nums=num1;
        }
        return nums[0];
        
    }
}