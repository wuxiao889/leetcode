package binary.search.l1011;

import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5));
        System.out.println(solution.shipWithinDays(new int[]{3,2,2,4,1,4},3));
        System.out.println(solution.shipWithinDays(new int[]{1,2,3,1,1},4));
    }
}
