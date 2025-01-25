package org.example.ADTs.Arrays;

public class MergeTwoSortedArrays {
    //Merge two sorted arrays
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,10,20,30};
        int [] nums2 = {2,5,6};
        int[] m = merge(nums1, nums2);
        for (int j : m) {
            System.out.println(j);
        }
    }

    public static int[] merge(int[] nums1, int[] nums2){
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0; int k = 0;
        while(i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                nums3[k++] = nums1[i++];
            } else if (nums1[i]>nums2[j]) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
            }
        }

        while (i<nums1.length) {
            nums3[k++] = nums1[i++];
        }

        while (j<nums2.length) {
            nums3[k++] = nums2[j++];
        }
        return nums3;
    }
}
