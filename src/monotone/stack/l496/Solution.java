package monotone.stack.l496;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedList<Integer> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i = nums2.length - 1; i >= 0; i--){
            while (!list.isEmpty() && nums2[i] >= list.peek()){
                list.pop();
            }
            int value = list.isEmpty() ? -1 : list.peek();
            map.put(nums2[i],value);
            list.push(nums2[i]);
            System.out.println(list);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
