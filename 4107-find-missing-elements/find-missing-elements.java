class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> p=new HashSet<>();
        for(int num:nums){
            p.add(num);
        }
        int min=Collections.min(p);
        int max=Collections.max(p);
        List<Integer> result=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!p.contains(i)){
                result.add(i);
            }
        }
        return result;
        
    }
}