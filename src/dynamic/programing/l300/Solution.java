package dynamic.programing.l300;

import java.util.Arrays;

/**
 * 动态规划解法
 * 难点在于如何定义dp
 * dp[i] 表示以 nums[i] 这个数结尾的最长递增子序列的长度。
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
//        Arrays.sort(dp);
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
