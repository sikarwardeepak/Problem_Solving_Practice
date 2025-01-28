package org.example.ADTs.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static int[] longestSubArray(int[] nums, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int currentSum = 0;
        int start = 0;
        int maxLen = 0;

        for (int i=0;i<nums.length;i++) {
            currentSum += nums[i];
            if (map.containsKey(currentSum - sum)) {
                if (i - map.get(currentSum - sum)>maxLen) {
                    start = map.get(currentSum - sum) + 1;
                    maxLen = i - map.get(currentSum -sum);
                }
            }
            map.putIfAbsent(currentSum, i);
        }
        return maxLen > 0 ? Arrays.copyOfRange(nums, start, start + maxLen) : new int[0];
    }

    //Find the longest subarray with a sum of k
    public static void main(String[] args) {
        int [] array = {1,1,2};
        int k = 2;
        int[] subarray = longestSubArray(array, k);
        System.out.println("Longest subarray: " + Arrays.toString(subarray));
    }
}
