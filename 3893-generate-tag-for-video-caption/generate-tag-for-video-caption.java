class Solution {
    public String generateTag(String caption) {
        StringBuilder result=new StringBuilder();
        result.append('#');
        boolean x=true;
        boolean y=false;
        for(int i=0;i<caption.length();i++){
            char ch=caption.charAt(i);
            if(ch==' '){
                if(!x){
                    y=true;
                }

            }
            else{
                if(x){
                    result.append(Character.toLowerCase(ch));
                    x=false;
                }
                else if(y){
                    result.append(Character.toUpperCase(ch));
                    y=false;
                }
                else{
                    result.append(Character.toLowerCase(ch));
                }
            }
            if(result.length()==100){
                break;
            }
            

        }
        return result.toString();
        
    }
}