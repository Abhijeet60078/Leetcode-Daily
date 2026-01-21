import java.util.*;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> o = new Stack<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') o.push(i);
            else if (ch == '*') st.push(i);
            else if (!o.isEmpty()) o.pop();
            else if (!st.isEmpty()) st.pop();
            else return false;
        }

        while (!o.isEmpty() && !st.isEmpty()) {
            if (o.peek() > st.peek()) {
                return false;
            }
            o.pop();
            st.pop();
        }

        return o.isEmpty();
    }
}
