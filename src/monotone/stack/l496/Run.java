package monotone.stack.l496;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Run {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2})));
    }
}
