package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0 || words[0].isEmpty()) return new ArrayList<>();
        if (s.length() < words.length * words[0].length()) return new ArrayList<>();

        int n = words.length;
        int sublength = words[0].length();
        List<Integer> indices = new ArrayList<>();

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }

        for (int i = 0; i<sublength; i++) {
            int left = i, right = i;
            Map<String, Integer> currentCount = new HashMap<>();
            int count = 0;

            while (right + sublength <= s.length()) {
                String word = s.substring(right, right + sublength);
                right += sublength;

                if (wordCount.containsKey(word)) {
                    currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentCount.get(word)>wordCount.get(word)) {
                        String leftWord = s.substring(left, left + sublength);
                        currentCount.put(leftWord, currentCount.get(leftWord)-1);
                        left+=sublength;
                        count--;
                    }

                    if (count == n) {
                        indices.add(left);
                    }
                } else {
                    currentCount.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        SubstringWithConcatenationAllWords obj = new SubstringWithConcatenationAllWords();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(obj.findSubstring(s, words));
    }
}
