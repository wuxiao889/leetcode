package binary.search.l410;

class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        for (int i : nums) {
            left = Math.max(left, i);
        }
        int right = 0;
        for (int i : nums) {
            right += i;
        }


        while (left < right) {
            int mid = left + (right - left) / 2;
            int splits = cal(nums, mid);
            if (splits <= m) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int cal(int[] nums, int n) {
        int splits = 0;
        int sum = 0;
        for (int i : nums) {
            if ((sum += i) > n) {
                sum = i;
                splits++;
            }
        }
        return ++splits;
    }

}
