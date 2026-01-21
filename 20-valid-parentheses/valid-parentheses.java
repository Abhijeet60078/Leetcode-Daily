class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch=='{'){
                stack.push(ch);
            }
            else if(ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char last=stack.pop();
                 if (ch == ')' && last != '(') {
                    return false;
                }
                if (ch == '}' && last != '{') {
                    return false;
                }
                if (ch == ']' && last != '[') {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }

        
    }
}