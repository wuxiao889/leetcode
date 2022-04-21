package binary.search.l875;

import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));//4
        System.out.println(solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));//30
        System.out.println(solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));//23
        System.out.println(solution.minEatingSpeed(new int[]{312884470}, 312884469));//2

    }
}
