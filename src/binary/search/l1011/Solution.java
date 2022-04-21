package binary.search.l1011;

/**
 * l410分割数组的最大值
 * 给定一个非负整数数组 nums 和一个整数 m ，你需要将这个数组分成 m 个非空的连续子数组。
 * 设计一个算法使得这 m 个子数组各自和的最大值最小。
 * <p>
 * <p>
 * 最低运载能力=每天运载货物重量和的最大值
 * 第一步先确立左右边界
 * 最小运载能力为货物重量最大值
 * 最大运载能力为货物重量和
 */
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        for (int i : weights) {
            left = Math.max(left, i);
        }
        int right = 0;
        for (int i : weights) {
            right += i;
        }


        while (left < right) {
            int mid = left + (right - left) / 2;
            int calDay = cal(weights, mid);
            System.out.println(calDay);
            if (calDay <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int cal(int[] weights, int weight) {
        int days = 0;
        int sum = 0;
        for (int i : weights) {
            if ((sum += i) > weight) {
                sum = i;
                days++;
            }
        }
        return ++days;
    }

}
