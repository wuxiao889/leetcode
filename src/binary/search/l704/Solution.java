package binary.search.l704;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        return binarySearch(nums, left, right, target);
    }

    /**
     * 右边界是开的 right = nums.length
     * 所以 left < right 不能等于
     * right = mid 而不用 +1
     * @param nums
     * @param left
     * @param right
     * @param target
     * @return
     */
    public int binarySearch(int[] nums, int left, int right, int target) {
        int mid = 0;
        if (left < right) {
//            mid = (left + right) >> 1;
            mid = left + (right - left) / 2; //防止(left + right)溢出
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
                return binarySearch(nums, left, right, target);
            } else {
                left = mid + 1;
                return binarySearch(nums, left, right, target);
            }
        }
        return -1;
    }

}
