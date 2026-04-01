import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> set = new HashSet<>();

        
        for (int num : friends) {
            set.add(num);
        }

        int[] result = new int[friends.length];
        int k = 0;

     
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                result[k++] = order[i];
            }
        }

        return result;
    }
}