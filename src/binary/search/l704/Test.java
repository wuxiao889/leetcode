package binary.search.l704;

import java.util.Arrays;

public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        Solution1 solution = new Solution1();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        System.out.println(Arrays.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(Arrays.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }


}
