package monotone.stack.l503;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    @Test
    public void test() {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[2 * nums.length];
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.empty() && nums[i % nums.length] >= stack.peek()) {
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i % nums.length]);
        }
        return Arrays.copyOf(res, nums.length);
    }
}
