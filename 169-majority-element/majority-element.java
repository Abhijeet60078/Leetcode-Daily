class Solution {
    public int majorityElement(int[] nums) {
        int first=nums[0];
        int z=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==first){
                z++;
            }
            else{
                z--;
            }
            if(z==0){
                first=nums[i];
                z=1;
            }
        }
        return first;
        
        
    }
}