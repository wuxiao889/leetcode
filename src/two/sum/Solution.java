package two.sum;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}