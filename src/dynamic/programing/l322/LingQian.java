package dynamic.programing.l322;

public class LingQian {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.coinChange(new int[]{1,2,5},11));
        System.out.println(solution.coinChange(new int[]{2},3));
        System.out.println(solution.coinChange(new int[]{1},0));
        System.out.println(solution.coinChange(new int[]{1,2,5},15));
    }
}
