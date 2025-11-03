import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //tart with correct target value
        backtrack(candidates, 0, target, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] candidates, int index, int target, List<List<Integer>> result, List<Integer> ans) {
        if (index == candidates.length || target < 0) {
            return;
        }

        // If target is achieved
        if (target == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        //Include current element (try using it)
        ans.add(candidates[index]);
        backtrack(candidates, index, target - candidates[index], result, ans); // allow reuse

        //Backtrack
        ans.remove(ans.size() - 1);

        //Exclude current element and move forward
        backtrack(candidates, index + 1, target, result, ans);
    }
}
