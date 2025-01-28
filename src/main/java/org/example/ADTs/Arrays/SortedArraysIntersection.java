package org.example.ADTs.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortedArraysIntersection {

    public static int[] intersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int value : array1) {
            set1.add(value);
        }

        Set<Integer> intersection = new HashSet<>();
        for(int value: array2) {
            if (set1.contains(value)) {
                intersection.add(value);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int value: intersection) {
            result[index++] = value;
        }
        return result;
    }

    //Find the intersection of two arrays
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,3,4,6};

        int[] intersection = intersection(array1, array2);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
