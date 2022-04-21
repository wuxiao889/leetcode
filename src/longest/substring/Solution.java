package longest.substring;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0, right = 0;
        while (right < s.length() - 1) {
            right++;
            while (s.charAt(left) != s.charAt(right) && right < s.length() - 1) {
                right++;
            }
            length = Integer.max(length, right - left);
            left = right;
        }
        return length;
    }
}