class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> m=new HashSet<>();
        for(int n:nums){
            m.add(n);
        }
        Integer[] arr=m.toArray(new Integer[0]);
        Arrays.sort(arr);
        if(arr.length<3){
            return arr[arr.length-1];

        }
        return arr[arr.length-3];
        
    }
}