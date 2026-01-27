class Solution {
    public int longestPalindrome(String s) {
        int oddCount=0;
        HashMap<Character,Integer> Map=new HashMap<>();
        for(char ch:s.toCharArray()){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
            if(Map.get(ch)%2==0){
                oddCount--;
            }
            else{
                oddCount++;
            }

        }
        if(oddCount>1){
            return s.length()-oddCount+1;
        }
        return s.length();

        
    }
}