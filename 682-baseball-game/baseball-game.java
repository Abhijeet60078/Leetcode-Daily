import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int score = 0;

        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];

            if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (s.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        for (int val : stack) {
            score += val;
        }

        return score;
    }
}
