package org.example.ADTs.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ValuesDuplicateInArray {

    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num: nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    //Find the duplicate number in an array
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        int duplicate = findDuplicate(nums);
        if (duplicate == -1) {
            System.out.println("Duplicate value not found.");
        } else {
            System.out.println("Duplicate value found: " + duplicate);
        }
    }
}
