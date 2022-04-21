package shift.window.l567;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution1 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int len = 2;
        int valid = 0;
        int start = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while (right - left == s1.length()) {
                if (valid == need.size()) {
                    return true;
                } else {
                    char d = s2.charAt(left);
                    if (need.containsKey(d)) {
                        if (window.get(d).equals(need.get(d))) {
                            valid--;
                        }
                        window.put(d, window.getOrDefault(d, 0) - 1);
                    }
                    left++;
                }
            }
        }

        return false;

    }
}
