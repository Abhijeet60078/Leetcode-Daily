class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maximum=0;
        for(int i=0;i<s.length();i++){
            boolean[] visited=new boolean[256];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(visited[ch]){
                    break;
                }
                visited[ch]=true;
                maximum=Math.max(maximum,j-i+1);
            }
        }
        return maximum;
        
    }
}