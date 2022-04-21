package binary.search.l34;

import java.util.Arrays;

public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{},8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{1},1)));
    }

    @org.junit.jupiter.api.Test
    public void test1(){
        System.out.println("-----");
        Solution1 solution = new Solution1();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{},8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{1},1)));
    }
}
