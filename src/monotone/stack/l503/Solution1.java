package monotone.stack.l503;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution1 {
    public int[] nextGreaterElements(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length];
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!list.isEmpty() && nums[i % nums.length] >= list.peek()) {
                list.pop();
            }
            res[i % nums.length] = list.isEmpty() ? -1 : list.peek();
            list.push(nums[i % nums.length]);
        }
        return res;
    }
}
