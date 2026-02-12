class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st=new Stack<>();
	    int maxStep=0;
	    for(int num:nums){
	        int currentStep=0;
	        while(!st.isEmpty()&&st.peek()[0]<=num){
	            currentStep=Math.max(currentStep,st.pop()[1]);
	        }
	        if(st.isEmpty()){
	            currentStep=0;
	        }
	        else{
	            currentStep+=1;
	        }
	        maxStep=Math.max(maxStep,currentStep);
	        st.push(new int[]{num,currentStep});
	    }
	    return maxStep;
        

        
    }
}