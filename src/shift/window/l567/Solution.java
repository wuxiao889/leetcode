package shift.window.l567;

import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
//        System.out.println(need);
//        System.out.println(need.size());

        int len = s1.length();
        int left = 0;

        while ((left + len -1 ) < s2.length()) {
            int valid = 0;
            HashMap<Character, Integer> window = new HashMap<>();
            for (int i = 0; i < len; i++) {
                char c = s2.charAt(left + i);
                if (!need.containsKey(c)) break;
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c) < window.get(c)) {
                    break;
                } else {
                    valid++;
                }
                if (valid == len) return true;
            }
            left++;
        }

        return false;
    }
}