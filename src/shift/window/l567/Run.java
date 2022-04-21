package shift.window.l567;

import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void test(){
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion("ab","eidbaooo"));
        System.out.println(solution.checkInclusion("a","ab"));
        System.out.println(solution.checkInclusion("adc","dcda"));
        System.out.println(solution.checkInclusion("hello","ooolleoooleh"));
    }

    @Test
    public void test1(){
        Solution1 solution = new Solution1();
        System.out.println(solution.checkInclusion("ab","eidbaooo"));
        System.out.println(solution.checkInclusion("a","ab"));
        System.out.println(solution.checkInclusion("adc","dcda"));
        System.out.println(solution.checkInclusion("hello","ooolleoooleh"));
        System.out.println(solution.checkInclusion("ab","eidboaoo"));
    }
}
