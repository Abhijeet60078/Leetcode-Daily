class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return new int[0];
        }
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int num:sorted){
            if(!map.containsKey(num)){
                map.put(num,r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;


        
    }
}