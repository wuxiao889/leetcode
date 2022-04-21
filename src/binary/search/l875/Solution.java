package binary.search.l875;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        right++;

        while (left < right) {
            int mid = left + (right - left) / 2;
//            if (count(piles, mid) == h) {
//                right = mid;
//            } else if (count(piles, mid) > h) {
//                left = mid + 1;
//            } else if (count(piles, mid) < h) {
//                right = mid;
//            }
            if (count(piles, mid) <= h) {
                right = mid;
            } else if (count(piles, mid) > h) {
                left = mid + 1;
            }
        }
        return left;
    }

    private int count(int[] piles, int mid) {
        int hour = 0;
        for (int pile : piles) {
            if (pile % mid == 0) {
                hour += pile / mid;
            } else {
                hour += pile / mid + 1;
            }
        }
        return hour;
    }

//    @Test
//    public void testCount() {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(count(new int[]{3, 6, 7, 11}, 4));
//        System.out.println(count(new int[]{30, 11, 23, 4, 20}, 30));
//        System.out.println(count(new int[]{30, 11, 23, 4, 20}, 23));
//    }
}
