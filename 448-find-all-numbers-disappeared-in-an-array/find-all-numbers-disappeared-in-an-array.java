class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashSet<Integer> p=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!p.contains(i)){
                result.add(i);
            }

        }
        return result;


        
    }
}