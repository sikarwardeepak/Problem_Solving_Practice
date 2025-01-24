package org.example.ADTs.Arrays;

import java.util.Scanner;

public class SecondSmallestLargestNumber {

    //Find the Second largest/smallest element in an array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i<n;i++) {
            numbers[i] = scanner.nextInt();
        }

        mergeSort(numbers);

        int firstSmallest = numbers[0];
        int firstLargest = numbers[n-1];
        int secondSmallest = -1;
        int secondLargest = -1;
        for (int i = n - 2;i>=0;i--) {
            if (numbers[i] != firstLargest) {
                secondLargest = numbers[i];
                break;
            }
        }

        for (int i = 0;i<n;i++) {
            if (numbers[i] != firstSmallest) {
                secondSmallest = numbers[i];
                break;
            }
        }

        if (numbers[0] == numbers[n - 1]) {
            System.out.println("Array must have at least two distinct elements.");
        } else {
            System.out.println("Second smallest = " + secondSmallest);
            System.out.println("Second largest = " + secondLargest);
        }
    }

    public static void mergeSort(int[] nums){
        if (nums.length <= 1) {
            return;
        }
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        System.arraycopy(nums, 0, left, 0, mid);
        System.arraycopy(nums, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(nums, left, right);
    }

    public static void merge(int[] nums, int[] left, int[] right){
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while(i<left.length) {
            nums[k++] = left[i++];
        }

        while(j<right.length) {
            nums[k++] = right[j++];
        }
    }
}
