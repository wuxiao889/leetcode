package two.sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,7,11,15},9)));
    }
}
