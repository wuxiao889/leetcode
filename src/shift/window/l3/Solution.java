package shift.window.l3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Believer
 */
public class Solution {
    @Test
    public void test() {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int len = 0;
        int max = 0;

        while (right < s.length()) {
            char c = s.charAt(right++);

            while (window.contains(c)) {
                char d = s.charAt(left++);
                window.remove(d);
                len--;

            }

            window.add(c);
            len++;
            max = max > len ? max : len;
        }
        return max;
    }
}
