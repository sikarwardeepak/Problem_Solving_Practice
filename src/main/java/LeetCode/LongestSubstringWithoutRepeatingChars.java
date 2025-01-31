package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right<s.length()){
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right-left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars obj = new LongestSubstringWithoutRepeatingChars();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
