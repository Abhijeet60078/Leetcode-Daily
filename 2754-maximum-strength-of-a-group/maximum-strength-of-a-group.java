class Solution {
    public long maxStrength(int[] nums) {
        long maxStrength=1;
        int count=0;

        int negativeCount=0;
        int smallestValue=Integer.MIN_VALUE;
        int zeroCount=0;
        for(int num:nums){
            if(num==0){
                zeroCount++;
                continue;
            }
            count++;
            maxStrength*=num;
            
            if(num<0){
                negativeCount++;
                smallestValue=Math.max(smallestValue,num);
            }
            
        }
        if(count==0){
            return 0;
        }
        if (count == 1 && negativeCount == 1 && zeroCount > 0)
            return 0;
        if(count==1&&negativeCount==1)return smallestValue;
        if(negativeCount%2!=0){
            maxStrength/=smallestValue;
            
        }
        return maxStrength;

        
    }
}