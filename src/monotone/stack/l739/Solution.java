package monotone.stack.l739;

import java.util.LinkedList;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int[] res = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!list.isEmpty() && temperatures[i] >= temperatures[list.peek()]) {
                list.pop();
            }
            res[i] = list.isEmpty() ? 0 : list.peek() - i;
            list.push(i);
        }
        return res;
    }
}
