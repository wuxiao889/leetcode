package monotone.stack.l503;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Run {
    @Test
    public void test(){
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.nextGreaterElements(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution1.nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
    }
}
