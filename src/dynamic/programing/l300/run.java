package dynamic.programing.l300;

public class run {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(solution.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        System.out.println(solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
        System.out.println(solution.lengthOfLIS(new int[]{1,4,3,4,2,3}));
    }
}
