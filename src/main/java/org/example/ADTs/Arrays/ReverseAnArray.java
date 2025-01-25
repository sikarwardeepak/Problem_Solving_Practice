package org.example.ADTs.Arrays;

public class ReverseAnArray {
    //Reverse an array
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array, 0, array.length - 1);
        for(int a: array){
            System.out.println(a);
        }
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
