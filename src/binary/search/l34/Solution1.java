package binary.search.l34;

import org.junit.jupiter.api.Test;

public class Solution1 {
    @Test
    public void testSearch() {
        System.out.println(search(new int[]{5, 7, 7, 8, 9, 10}, 8));
        System.out.println(search(new int[]{1, 2, 5, 9}, 5));
        System.out.println(search(new int[]{5, 7, 7, 8, 9, 10}, 6));
        System.out.println(search(new int[]{}, 8));
    }

    @Test
    public void testLeft() {
        System.out.println(left_bound(new int[]{5, 5, 7, 7, 7, 10}, 7));
        System.out.println(left_bound(new int[]{5, 7, 7, 8, 9, 10}, 1));
        System.out.println(left_bound(new int[]{1}, 1));
        System.out.println(left_bound(new int[]{1}, 2));
        System.out.println(left_bound(new int[]{7, 7, 7, 7, 7, 7}, 7));
    }

    @Test
    public void testRight() {
        System.out.println(right_bound(new int[]{5, 5, 7, 7, 7, 10}, 7));
        System.out.println(right_bound(new int[]{5, 5, 7, 7, 7, 10}, 9));
        System.out.println(right_bound(new int[]{1}, 1));
        System.out.println(right_bound(new int[]{1, 1, 1, 1, 1}, 1));

    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left == nums.length || nums[left] != target) {
            return -1;
        } else return left;
    }

    public int right_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (left == 0 || nums[left - 1] != target) {
            return -1;
        } else return left - 1;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }
}
