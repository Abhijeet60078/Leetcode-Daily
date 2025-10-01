import java.util.*;

class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> components = new ArrayList<>();
        int place = 1;
        int temp = n;

        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                components.add(digit * place);
            }
            temp /= 10;
            place *= 10;
        }

        
        Collections.reverse(components);

        
        int[] result = new int[components.size()];
        for (int i = 0; i < components.size(); i++) {
            result[i] = components.get(i);
        }

        return result;
    }
}
