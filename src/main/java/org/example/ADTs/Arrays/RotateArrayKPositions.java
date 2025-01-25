package org.example.ADTs.Arrays;

public class RotateArrayKPositions {
    //Rotate an array by k positions
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        rotate(array, k);
        for(int a:array) {
            System.out.println(a);
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static  void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
