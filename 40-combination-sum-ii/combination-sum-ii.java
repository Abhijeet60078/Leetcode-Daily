class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, result, new ArrayList<>());

        return result;




        
    }
    private void backtrack(int[] candidates,int index,int target,List<List<Integer>> result,List<Integer> ans){
        if(target<0)return;
        if(target==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            ans.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], result, ans); 
            ans.remove(ans.size() - 1);


        }
        
    }
}